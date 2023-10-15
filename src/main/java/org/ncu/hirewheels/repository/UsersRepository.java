package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.entities.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<users, Integer> {
	 users findByEmail(String email);
}
