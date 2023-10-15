package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.entities.fuel_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<fuel_type, Integer>{

}