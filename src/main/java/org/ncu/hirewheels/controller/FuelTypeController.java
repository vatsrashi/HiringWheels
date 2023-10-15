package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.fuel_type;
import org.ncu.hirewheels.service.FuelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/fuel-types")
public class FuelTypeController {
    @Autowired
    private FuelTypeService fuelTypeService;

    @PostMapping("/add")
    public ResponseEntity<fuel_type> addFuelType(@RequestBody fuel_type fuelType) {
        fuel_type newFuelType = fuelTypeService.addFuelType(fuelType);
        return new ResponseEntity<>(newFuelType, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<fuel_type> getFuelTypeById(@PathVariable("id") Integer fuelTypeId) {
        fuel_type fuelType = fuelTypeService.getFuelTypeById(fuelTypeId);
        if (fuelType != null) {
            return new ResponseEntity<>(fuelType, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<fuel_type> updateFuelType(@PathVariable("id") Integer fuelTypeId, @RequestBody fuel_type updatedFuelType) {
        fuel_type updated = fuelTypeService.updateFuelType(fuelTypeId, updatedFuelType);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteFuelType(@PathVariable("id") Integer fuelTypeId) {
        fuelTypeService.deleteFuelType(fuelTypeId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
