package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.vehicle_category;
import org.ncu.hirewheels.repository.VehicleCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleCategoryServiceImpl implements VehicleCategoryService {
    private final VehicleCategoryRepository vehicleCategoryRepository;

    @Autowired
    public VehicleCategoryServiceImpl(VehicleCategoryRepository vehicleCategoryRepository) {
        this.vehicleCategoryRepository = vehicleCategoryRepository;
    }

    @Override
    public vehicle_category addVehicleCategory(vehicle_category vehicleCategory) {
        return vehicleCategoryRepository.save(vehicleCategory);
    }

    @Override
    public vehicle_category getVehicleCategoryById(Integer vehicleCategoryId) {
        return vehicleCategoryRepository.findById(vehicleCategoryId).orElse(null);
    }

    @Override
    public vehicle_category updateVehicleCategory(Integer vehicleCategoryId, vehicle_category updatedVehicleCategory) {
        if (vehicleCategoryRepository.existsById(vehicleCategoryId)) {
            // Load the existing vehicle category
            vehicle_category existingVehicleCategory = vehicleCategoryRepository.getById(vehicleCategoryId);

            // Update the fields of the existing vehicle category with the values from updatedVehicleCategory
            existingVehicleCategory.setVehicleCategoryName(updatedVehicleCategory.getVehicleCategoryName());

            // Save the updated vehicle category
            return vehicleCategoryRepository.save(existingVehicleCategory);
        }
        return null;
    }

    @Override
    public void deleteVehicleCategory(Integer vehicleCategoryId) {
        vehicleCategoryRepository.deleteById(vehicleCategoryId);
    }
}
