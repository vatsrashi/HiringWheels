package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.fuel_type;
import org.ncu.hirewheels.repository.FuelTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuelTypeServiceImpl implements FuelTypeService {
    private final FuelTypeRepository fuelTypeRepository;

    @Autowired
    public FuelTypeServiceImpl(FuelTypeRepository fuelTypeRepository) {
        this.fuelTypeRepository = fuelTypeRepository;
    }

    @Override
    public fuel_type addFuelType(fuel_type fuelType) {
        return fuelTypeRepository.save(fuelType);
    }

    @Override
    public fuel_type getFuelTypeById(Integer fuelTypeId) {
        return fuelTypeRepository.findById(fuelTypeId).orElse(null);
    }

    @Override
    public fuel_type updateFuelType(Integer fuelTypeId, fuel_type updatedFuelType) {
        if (fuelTypeRepository.existsById(fuelTypeId)) {
            // Load the existing fuel type
            fuel_type existingFuelType = fuelTypeRepository.getById(fuelTypeId);

            // Update the fields of the existing fuel type with the values from updatedFuelType
            existingFuelType.setFuelType(updatedFuelType.getFuelType());

            // Save the updated fuel type
            return fuelTypeRepository.save(existingFuelType);
        }
        return null;
    }

    @Override
    public void deleteFuelType(Integer fuelTypeId) {
        fuelTypeRepository.deleteById(fuelTypeId);
    }
}
