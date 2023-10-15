package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.vehicle_subcategory;
import org.ncu.hirewheels.repository.VehicleSubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleSubcategoryServiceImpl implements VehicleSubcategoryService {
    private final VehicleSubcategoryRepository vehicleSubcategoryRepository;

    @Autowired
    public VehicleSubcategoryServiceImpl(VehicleSubcategoryRepository vehicleSubcategoryRepository) {
        this.vehicleSubcategoryRepository = vehicleSubcategoryRepository;
    }

    @Override
    public vehicle_subcategory addVehicleSubcategory(vehicle_subcategory vehicleSubcategory) {
        return vehicleSubcategoryRepository.save(vehicleSubcategory);
    }

    @Override
    public vehicle_subcategory getVehicleSubcategoryById(Integer vehicleSubcategoryId) {
        return vehicleSubcategoryRepository.findById(vehicleSubcategoryId).orElse(null);
    }

    @Override
    public vehicle_subcategory updateVehicleSubcategory(Integer vehicleSubcategoryId, vehicle_subcategory updatedVehicleSubcategory) {
        if (vehicleSubcategoryRepository.existsById(vehicleSubcategoryId)) {
            // Load the existing vehicle subcategory
            vehicle_subcategory existingVehicleSubcategory = vehicleSubcategoryRepository.getById(vehicleSubcategoryId);

            // Update the fields of the existing vehicle subcategory with the values from updatedVehicleSubcategory
            existingVehicleSubcategory.setVehicleSubcategoryName(updatedVehicleSubcategory.getVehicleSubcategoryName());
            existingVehicleSubcategory.setPricePerDay(updatedVehicleSubcategory.getPricePerDay());

            // Save the updated vehicle subcategory
            return vehicleSubcategoryRepository.save(existingVehicleSubcategory);
        }
        return null;
    }

    @Override
    public void deleteVehicleSubcategory(Integer vehicleSubcategoryId) {
        vehicleSubcategoryRepository.deleteById(vehicleSubcategoryId);
    }
}
