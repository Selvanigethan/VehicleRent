package com.example.VehicleRent.Service;

import com.example.VehicleRent.Model.Vehicle;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RentAVehicleServiceTest {

    @Mock
    Vehicle vehicleOne;

    @Mock
    Vehicle vehicleTwo;

    RentAVehicleService rentAVehicleService = new RentAVehicleService();

    @Test
    void testGetVehicles() {
        assertEquals(0, rentAVehicleService.getVehicles().size());
    }

    @Test
    void testAddVehicleTrue() {
        when(vehicleOne.getVehicleId()).thenReturn(1100);
        assertTrue(rentAVehicleService.addVehicle(vehicleOne));
        assertEquals(1, rentAVehicleService.getVehicles().size());
        assertEquals(1100, rentAVehicleService.getVehicles().get(0).getVehicleId());
    }

    @Test
    void testAddVehicleFalse() {
        when(vehicleOne.getVehicleId()).thenReturn(1100);
        when(vehicleTwo.getVehicleId()).thenReturn(1100);
        rentAVehicleService.addVehicle(vehicleOne);
        assertFalse(rentAVehicleService.addVehicle(vehicleTwo));
        assertEquals(1, rentAVehicleService.getVehicles().size());
    }

}
