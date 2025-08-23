package com.devsouza.PersonAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsouza.PersonAPI.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
