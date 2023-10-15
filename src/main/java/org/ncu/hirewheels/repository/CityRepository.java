package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.entities.city;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<city, Integer>{

}