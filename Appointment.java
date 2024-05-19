package com.practo.practo.entity;

import jakarta.persistence.*;

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long patientId;

    private long doctorId;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}
