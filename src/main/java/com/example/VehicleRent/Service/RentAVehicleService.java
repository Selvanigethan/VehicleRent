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
        for (Vehicle vehicleInList : vehicles) {
            if (vehicleInList.getVehicleId() == vehicle.getVehicleId()) {
                throw new RuntimeException("Vehicle with the vehicle id is already available");
            }
        }
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
        return false;
    }

    public boolean enableVehicle(int vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId() == vehicleId) {
                vehicle.setAvailable(true);
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicle(int vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId() == vehicleId) {
                vehicles.remove(vehicle);
                return true;
            }
        }
        return false;
    }
}
