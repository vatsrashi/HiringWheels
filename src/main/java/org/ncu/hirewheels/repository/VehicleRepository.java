package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.entities.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<vehicle, Integer>{

}
