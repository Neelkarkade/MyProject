package com.reservationapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "route")
public class Route {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String fromLocation;
        private String toLocation;
        private String fromDate;
        private String toDate;
        private String totalDuration;
        private String fromTime;
        private String toTime;

        @OneToMany
        private List<SubRoute> subRoutes;

    }

