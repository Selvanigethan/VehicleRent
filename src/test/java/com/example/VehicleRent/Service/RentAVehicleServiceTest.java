package com.example.VehicleRent.Service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RentAVehicleServiceTest {

    RentAVehicleService rentAVehicleService = new RentAVehicleService();

    @Test
    void testGetVehicles() {
        assertEquals(0, rentAVehicleService.getVehicles().size());
    }


}
