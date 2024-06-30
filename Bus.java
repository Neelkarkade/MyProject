package com.reservationapp.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.springframework.util.RouteMatcher;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;
    private String busNumber;
    private String busType;
    private double price;
    private int totalSeats;
    private int availableSeats;

    @OneToOne
    private Route route;

    // Constructors, getters, and setters
}
