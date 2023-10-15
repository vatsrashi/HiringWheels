package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.vehicle_category;

public interface VehicleCategoryService {
    vehicle_category addVehicleCategory(vehicle_category vehicleCategory);
    vehicle_category getVehicleCategoryById(Integer vehicleCategoryId);
    vehicle_category updateVehicleCategory(Integer vehicleCategoryId, vehicle_category updatedVehicleCategory);
    void deleteVehicleCategory(Integer vehicleCategoryId);
}
