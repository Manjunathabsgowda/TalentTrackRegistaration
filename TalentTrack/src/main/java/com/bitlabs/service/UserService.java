package com.bitlabs.service;

import com.bitlabs.entity.User;

public interface UserService {
	boolean adminLogin(User user);
	boolean login(User user);
     User addUser(User user);
}
