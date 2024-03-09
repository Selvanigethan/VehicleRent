package com.example.VehicleRent.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle {

    private String model;
    private int number;
    private Year makeYear;

    private int vehicleId;
    private boolean isAvailable;

}
