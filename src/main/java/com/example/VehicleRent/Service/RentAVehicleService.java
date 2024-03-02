package com.example.VehicleRent.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentAVehicleService {

    public List<String> getVehicles() {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("Toyota");
        vehicles.add("BMW");
        vehicles.add("Benz");
        return vehicles;
    }

}
