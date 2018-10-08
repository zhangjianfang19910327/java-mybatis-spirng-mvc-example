package com.web.service;

import com.web.entity.User;

public interface LoginService {
	public User login(String username, String password);
}
