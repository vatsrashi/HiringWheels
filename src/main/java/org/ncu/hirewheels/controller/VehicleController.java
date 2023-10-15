package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.vehicle;
import org.ncu.hirewheels.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/add")
    public ResponseEntity<vehicle> addVehicle(@RequestBody vehicle vehicle) {
        vehicle newVehicle = vehicleService.addVehicle(vehicle);
        return new ResponseEntity<>(newVehicle, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<vehicle> getVehicleById(@PathVariable("id") Integer vehicleId) {
        vehicle vehicle = vehicleService.getVehicleById(vehicleId);
        if (vehicle != null) {
            return new ResponseEntity<>(vehicle, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<vehicle> updateVehicle(@PathVariable("id") Integer vehicleId, @RequestBody vehicle updatedVehicle) {
        vehicle updated = vehicleService.updateVehicle(vehicleId, updatedVehicle);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteVehicle(@PathVariable("id") Integer vehicleId) {
        vehicleService.deleteVehicle(vehicleId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
