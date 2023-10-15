package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.fuel_type;

public interface FuelTypeService {
    fuel_type addFuelType(fuel_type fuelType);
    fuel_type getFuelTypeById(Integer fuelTypeId);
    fuel_type updateFuelType(Integer fuelTypeId, fuel_type updatedFuelType);
    void deleteFuelType(Integer fuelTypeId);
}
