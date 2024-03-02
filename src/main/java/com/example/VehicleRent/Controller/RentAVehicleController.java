package com.example.VehicleRent.Controller;

import com.example.VehicleRent.Service.RentAVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<String> getVehicles() {
        return rentAVehicleService.getVehicles();
    }

}
