package com.example.VehicleRent.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Getter
@Setter
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;

    private String model;
    private int number;
    private Year makeYear;

    private boolean isAvailable;

}
