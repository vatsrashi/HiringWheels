package org.ncu.hirewheels.repository;


import org.ncu.hirewheels.entities.location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<location, Integer>{

}