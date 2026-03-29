package com.redbus.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bus_operator")
public class BusOperator {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
private String operatorName;
private String fromLocation;
private String toLocation;
@Temporal(TemporalType.DATE)
private Date date;
private int seats;
private double price;
private String type;











}
