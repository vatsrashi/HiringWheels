package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.entities.vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCategoryRepository extends JpaRepository<vehicle_category, Integer>{

}