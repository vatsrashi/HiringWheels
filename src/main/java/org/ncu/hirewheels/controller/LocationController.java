package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.location;
import org.ncu.hirewheels.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @PostMapping("/add")
    public ResponseEntity<location> addLocation(@RequestBody location location) {
        location newLocation = locationService.addLocation(location);
        return new ResponseEntity<>(newLocation, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<location> getLocationById(@PathVariable("id") Integer locationId) {
        location location = locationService.getLocationById(locationId);
        if (location != null) {
            return new ResponseEntity<>(location, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<location> updateLocation(@PathVariable("id") Integer locationId, @RequestBody location updatedLocation) {
        location updated = locationService.updateLocation(locationId, updatedLocation);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteLocation(@PathVariable("id") Integer locationId) {
        locationService.deleteLocation(locationId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
