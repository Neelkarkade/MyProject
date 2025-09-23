package com.app.controller;

import com.app.entity.cars.Brand;
import com.app.repository.BrandRepository;
import com.app.service.BulkCarUploadService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/brand/bulk-upload")
public class BrandBulkUploadController {

    private final BulkCarUploadService bulkCarUploadService;
    private final BrandRepository brandRepository;

    public BrandBulkUploadController(BulkCarUploadService bulkCarUploadService, BrandRepository brandRepository) {
        this.bulkCarUploadService = bulkCarUploadService;
        this.brandRepository = brandRepository;
    }

    @PostMapping("/upload")
    public String uploadExcelFile() {
        String filePath = "C:\\Users\\Neel\\OneDrive\\Documents\\Book125.xlsx";

        try {
            List<Brand> brands = bulkCarUploadService.readExcel(filePath);

            if (brands.isEmpty()) {
                return "No brands found in the Excel file.";
            }

            brandRepository.saveAll(brands);
            return "Brands uploaded successfully: " + brands.size();
        } catch (IOException e) {
            return "Error reading Excel file: " + e.getMessage();
        } catch (Exception e) {
            return "Error uploading brands: " + e.getMessage();
        }
    }
}
