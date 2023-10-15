package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.vehicle;
import org.ncu.hirewheels.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/register-vehicle")
    public ResponseEntity<vehicle> registerVehicle(@RequestBody vehicle vehicle) {
        vehicle registeredVehicle = adminService.registerVehicle(vehicle);
        return new ResponseEntity<>(registeredVehicle, HttpStatus.OK);
    }

    @PatchMapping("/change-availability/{vehicleId}")
    public ResponseEntity<vehicle> changeAvailability(@PathVariable("vehicleId") int vehicleId, @RequestParam("available") boolean available) {
        vehicle updatedVehicle = adminService.changeAvailability(vehicleId, available);
        if (updatedVehicle != null) {
            return new ResponseEntity<>(updatedVehicle, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
