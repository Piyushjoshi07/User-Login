package com.projectLogin.repository;



import org.springframework.data.repository.CrudRepository;

import com.projectLogin.domain.User;



public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
}