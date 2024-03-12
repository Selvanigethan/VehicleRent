package com.example.VehicleRent.Service;

import com.example.VehicleRent.Model.Vehicle;
import com.example.VehicleRent.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentAVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    private final List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }

    public boolean addVehicle(Vehicle vehicle) {
        List<Vehicle> vehiclesFromRepo = vehicleRepository.findAll();
        for (Vehicle vehicleInList : vehiclesFromRepo) {
            if (vehicleInList.getVehicleId() == vehicle.getVehicleId()) {
                return false;
            }
        }
        vehicle.setAvailable(true);
        vehicleRepository.save(vehicle);
        return true;
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
