package com.example.VehicleRent.Controller;

import com.example.VehicleRent.Model.Vehicle;
import com.example.VehicleRent.Service.RentAVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RentAVehicleController {

    //@Autowired
    RentAVehicleService rentAVehicleService;

    @Autowired
    public RentAVehicleController (RentAVehicleService rentAVehicleService) {
        this.rentAVehicleService = rentAVehicleService;
    }

    @GetMapping("/vehicles")
    public List<Vehicle> getVehicles() {
        return rentAVehicleService.getVehicles();
    }

    @PostMapping("/vehicle")
    public void addVehicle(@RequestBody Vehicle vehicle) {
        rentAVehicleService.addVehicle(vehicle);
    }

}
