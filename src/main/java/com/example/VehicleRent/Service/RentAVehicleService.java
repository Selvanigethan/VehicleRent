package com.example.VehicleRent.Service;

import com.example.VehicleRent.Model.Vehicle;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Service
public class RentAVehicleService {

    private List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
