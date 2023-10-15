package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.vehicle_category;
import org.ncu.hirewheels.service.VehicleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/vehicleCategories")
public class VehicleCategoryController {
    @Autowired
    private VehicleCategoryService vehicleCategoryService;

    @PostMapping("/add")
    public ResponseEntity<vehicle_category> addVehicleCategory(@RequestBody vehicle_category vehicleCategory) {
        vehicle_category newVehicleCategory = vehicleCategoryService.addVehicleCategory(vehicleCategory);
        return new ResponseEntity<>(newVehicleCategory, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<vehicle_category> getVehicleCategoryById(@PathVariable("id") Integer vehicleCategoryId) {
        vehicle_category vehicleCategory = vehicleCategoryService.getVehicleCategoryById(vehicleCategoryId);
        if (vehicleCategory != null) {
            return new ResponseEntity<>(vehicleCategory, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<vehicle_category> updateVehicleCategory(@PathVariable("id") Integer vehicleCategoryId, @RequestBody vehicle_category updatedVehicleCategory) {
        vehicle_category updated = vehicleCategoryService.updateVehicleCategory(vehicleCategoryId, updatedVehicleCategory);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteVehicleCategory(@PathVariable("id") Integer vehicleCategoryId) {
        vehicleCategoryService.deleteVehicleCategory(vehicleCategoryId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
