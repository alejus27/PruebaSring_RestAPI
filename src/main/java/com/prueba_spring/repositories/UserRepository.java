package com.prueba_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba_spring.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUserId(long userId);

}
