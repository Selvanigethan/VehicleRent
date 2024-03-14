package com.example.VehicleRent.Service;

import com.example.VehicleRent.Model.Vehicle;
import com.example.VehicleRent.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentAVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

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
        return changeVehicleAvailability(vehicleId, false);
    }

    public boolean enableVehicle(int vehicleId) {
        return changeVehicleAvailability(vehicleId, true);
    }

    public boolean deleteVehicle(int vehicleId) {
        List<Vehicle> vehiclesFromRepo = vehicleRepository.findAll();
        for (Vehicle vehicleInList : vehiclesFromRepo) {
            if (vehicleInList.getVehicleId() == vehicleId) {
                vehicleRepository.deleteById(vehicleId);
                return true;
            }
        }
        return false;
    }

    private boolean changeVehicleAvailability(int vehicleId, boolean inputBoolean) {
        List<Vehicle> vehiclesFromRepo = vehicleRepository.findAll();
        for (Vehicle vehicleInList : vehiclesFromRepo) {
            if (vehicleInList.getVehicleId() == vehicleId) {
                vehicleInList.setAvailable(inputBoolean);
                vehicleRepository.save(vehicleInList);
                return true;
            }
        }
        return false;
    }
}
