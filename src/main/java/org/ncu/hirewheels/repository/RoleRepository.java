package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.entities.role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<role, Integer>{

}
