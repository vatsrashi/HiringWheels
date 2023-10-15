package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.location;
import org.ncu.hirewheels.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public location addLocation(location location) {
        return locationRepository.save(location);
    }

    @Override
    public location getLocationById(Integer locationId) {
        return locationRepository.findById(locationId).orElse(null);
    }

    @Override
    public location updateLocation(Integer locationId, location updatedLocation) {
        if (locationRepository.existsById(locationId)) {
            // Load the existing location
            location existingLocation = locationRepository.getById(locationId);

            // Update the fields of the existing location with the values from updatedLocation
            existingLocation.setLocationName(updatedLocation.getLocationName());
            existingLocation.setAddress(updatedLocation.getAddress());
            existingLocation.setPincode(updatedLocation.getPincode());

            // Save the updated location
            return locationRepository.save(existingLocation);
        }
        return null;
    }

    @Override
    public void deleteLocation(Integer locationId) {
        locationRepository.deleteById(locationId);
    }
}
