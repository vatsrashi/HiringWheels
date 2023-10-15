package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.city; // Updated entity class name to lowercase
import org.ncu.hirewheels.service.CityService; // Updated service class name to uppercase
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/add")
    public ResponseEntity<city> addCity(@RequestBody city city) {
        city newCity = cityService.addCity(city);
        return new ResponseEntity<>(newCity, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<city> getCityById(@PathVariable("id") Integer cityId) {
        city city = cityService.getCityById(cityId);
        if (city != null) {
            return new ResponseEntity<>(city, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<city> updateCity(@PathVariable("id") Integer cityId, @RequestBody city updatedCity) {
        city updated = cityService.updateCity(cityId, updatedCity);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteCity(@PathVariable("id") Integer cityId) {
        cityService.deleteCity(cityId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
