package org.ncu.hirewheels.repository;


import org.ncu.hirewheels.entities.booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<booking, Integer>{

}