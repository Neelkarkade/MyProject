package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bus_stops")
public class BusStops {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "stops_id")
    private Stops stops;

    @Column(name = "stop_order")
    private int stopOrder;

    public Stops getStops() {
        return stops;
    }

    public void setStops(Stops stops) {
        this.stops = stops;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}