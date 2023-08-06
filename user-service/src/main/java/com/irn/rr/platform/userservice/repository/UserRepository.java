package com.irn.rr.platform.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irn.rr.platform.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
