package com.reservationapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Data
    public class Driver {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long driverId;
        private String Name;
        private String LicenseNumber;
        private String addNumber;
        private String address;
        private String contactNumber;
        private String alternateContactNumber;
        private String emailId;

        // Constructors, getters, and setters
    }


