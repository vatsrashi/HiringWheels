package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.entities.vehicle_subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleSubcategoryRepository extends JpaRepository<vehicle_subcategory, Integer>{

}
