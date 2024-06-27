package com.reservationapp.controller;

import com.reservationapp.entity.Bus;
import com.reservationapp.paylod.BusDto;
import com.reservationapp.repository.BusRepository;
import com.reservationapp.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
@RequestMapping("/api/v1/bus")
public class BusController {
    @Autowired
    private BusService busService;

    //http://localhost:8080/api/v1/bus/add

    @PostMapping("/add")
    public ResponseEntity<String> addBus(@RequestBody BusDto busDto) throws ParseException {

        busService.addBus(busDto);
        return new ResponseEntity<>("Bus details added", HttpStatus.CREATED);


    }
        }








