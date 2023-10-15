package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.vehicle_subcategory;

public interface VehicleSubcategoryService {
    vehicle_subcategory addVehicleSubcategory(vehicle_subcategory vehicleSubcategory);
    vehicle_subcategory getVehicleSubcategoryById(Integer vehicleSubcategoryId);
    vehicle_subcategory updateVehicleSubcategory(Integer vehicleSubcategoryId, vehicle_subcategory updatedVehicleSubcategory);
    void deleteVehicleSubcategory(Integer vehicleSubcategoryId);
}
