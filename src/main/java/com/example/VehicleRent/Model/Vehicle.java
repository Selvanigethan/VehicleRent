package com.example.VehicleRent.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Getter
@Setter
@Entity
public class Vehicle {

    @Id
    private int vehicleId;

    private String model;
    private int number;
    private Year makeYear;

    private boolean isAvailable;

}
