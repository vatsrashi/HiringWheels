package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.vehicle;
import org.ncu.hirewheels.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
@Autowired
private VehicleRepository vehicleRepository;

@Override
public vehicle registerVehicle(vehicle vehicle) {
// Set availability status to 1 by default
vehicle.setAvailabilityStatus(1);

// Save the vehicle to the database
vehicle savedVehicle = vehicleRepository.save(vehicle);

return savedVehicle;
}
@Override
public vehicle changeAvailability(int vehicleId, boolean available) {
// Find the vehicle by its ID
vehicle vehicle = vehicleRepository.findById(vehicleId).orElse(null);

if (vehicle != null) {
// Update the availability status based on the 'available' parameter
if (available) {
vehicle.setAvailabilityStatus(1); // Set available
} else {
vehicle.setAvailabilityStatus(0); // Set unavailable
}

// Save the updated vehicle to the database
return vehicleRepository.save(vehicle);
}

return null; // Vehicle not found
}
}

