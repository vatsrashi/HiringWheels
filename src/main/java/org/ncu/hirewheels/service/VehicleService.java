package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.vehicle;

public interface VehicleService {
    vehicle addVehicle(vehicle vehicle);
    vehicle getVehicleById(Integer vehicleId);
    vehicle updateVehicle(Integer vehicleId, vehicle updatedVehicle);
    void deleteVehicle(Integer vehicleId);
}
