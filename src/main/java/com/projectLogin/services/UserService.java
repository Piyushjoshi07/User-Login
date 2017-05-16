package com.projectLogin.services;

import com.projectLogin.domain.User;

public interface UserService {

	public User findByEmail(String email);
	
}