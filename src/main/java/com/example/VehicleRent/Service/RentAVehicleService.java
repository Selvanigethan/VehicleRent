package com.example.VehicleRent.Service;

import com.example.VehicleRent.Model.Vehicle;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class RentAVehicleService {

    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        vehicles.add(vehicle);
    }

    public boolean disableVehicle(int vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId() == vehicleId) {
                vehicle.setAvailable(false);
                return true;
            }
        }
        throw new RuntimeException("Vehicle with the Id was not found");
    }

    public boolean enableVehicle(int vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId() == vehicleId) {
                vehicle.setAvailable(true);
                return true;
            }
        }
        throw new RuntimeException("Vehicle with the Id was not found");
    }

}
