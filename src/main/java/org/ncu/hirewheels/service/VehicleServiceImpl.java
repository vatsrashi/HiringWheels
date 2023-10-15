package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.vehicle;
import org.ncu.hirewheels.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public vehicle addVehicle(vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public vehicle getVehicleById(Integer vehicleId) {
        return vehicleRepository.findById(vehicleId).orElse(null);
    }

    @Override
    public vehicle updateVehicle(Integer vehicleId, vehicle updatedVehicle) {
        if (vehicleRepository.existsById(vehicleId)) {
            // Load the existing vehicle
            vehicle existingVehicle = vehicleRepository.getById(vehicleId);

            // Update the fields of the existing vehicle with the values from updatedVehicle
            existingVehicle.setVehicleModel(updatedVehicle.getVehicleModel());
            existingVehicle.setVehicleNumber(updatedVehicle.getVehicleNumber());
            existingVehicle.setColor(updatedVehicle.getColor());
            existingVehicle.setAvailabilityStatus(updatedVehicle.getAvailabilityStatus());
            existingVehicle.setVehicleImageUrl(updatedVehicle.getVehicleImageUrl());

            // Save the updated vehicle
            return vehicleRepository.save(existingVehicle);
        }
        return null;
    }

    @Override
    public void deleteVehicle(Integer vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }
}
