package org.ncu.hirewheels.service;
import org.ncu.hirewheels.entities.vehicle;

public interface AdminService {

vehicle registerVehicle(vehicle vehicle);

vehicle changeAvailability(int vehicleId, boolean available);

}

