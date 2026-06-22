package com.carsellbuy.controller;

import com.carsellbuy.entity.Car;
import com.carsellbuy.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostMapping("/add")
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @GetMapping("/all")
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping("/search/make/{make}")
    public List<Car> searchByMake(@PathVariable String make) {
        return carRepository.findByMakeIgnoreCase(make);
    }
}
