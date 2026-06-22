package com.carsellbuy.controller;

import com.carsellbuy.repository.UserRepository;
import com.carsellbuy.repository.CarRepository;
import com.carsellbuy.repository.TransactionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final UserRepository userRepository;
    private final CarRepository carRepository;
    private final TransactionRepository transactionRepository;

    public AdminController(UserRepository userRepository, CarRepository carRepository, TransactionRepository transactionRepository) {
        this.userRepository = userRepository;
        this.carRepository = carRepository;
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/stats")
    public Map<String, Long> getStats() {
        Map<String, Long> stats = new HashMap<>();
        stats.put("users", userRepository.count());
        stats.put("cars", carRepository.count());
        stats.put("transactions", transactionRepository.count());
        return stats;
    }

    @GetMapping("/dashboard")
    public Map<String, String> dashboard() {
        return Map.of(
                "message", "Welcome Admin Dashboard",
                "user", "neel@example.com"
        );
    }
}
