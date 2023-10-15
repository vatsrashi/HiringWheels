package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.vehicle_subcategory;
import org.ncu.hirewheels.service.VehicleSubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/vehicle-subcategories")
public class VehicleSubcategoryController {
    @Autowired
    private VehicleSubcategoryService vehicleSubcategoryService;

    @PostMapping("/add")
    public ResponseEntity<vehicle_subcategory> addVehicleSubcategory(@RequestBody vehicle_subcategory vehicleSubcategory) {
        vehicle_subcategory newVehicleSubcategory = vehicleSubcategoryService.addVehicleSubcategory(vehicleSubcategory);
        return new ResponseEntity<>(newVehicleSubcategory, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<vehicle_subcategory> getVehicleSubcategoryById(@PathVariable("id") Integer vehicleSubcategoryId) {
        vehicle_subcategory vehicleSubcategory = vehicleSubcategoryService.getVehicleSubcategoryById(vehicleSubcategoryId);
        if (vehicleSubcategory != null) {
            return new ResponseEntity<>(vehicleSubcategory, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<vehicle_subcategory> updateVehicleSubcategory(@PathVariable("id") Integer vehicleSubcategoryId, @RequestBody vehicle_subcategory updatedVehicleSubcategory) {
        vehicle_subcategory updated = vehicleSubcategoryService.updateVehicleSubcategory(vehicleSubcategoryId, updatedVehicleSubcategory);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteVehicleSubcategory(@PathVariable("id") Integer vehicleSubcategoryId) {
        vehicleSubcategoryService.deleteVehicleSubcategory(vehicleSubcategoryId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
