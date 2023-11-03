package com.bitlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bitlabs.entity.User;
import com.bitlabs.repo.UserRepositary;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private  UserRepositary userRepository;
	public UserServiceImpl(UserRepositary userRepository) {
        this.userRepository = userRepository;
    }
	@Override
	public boolean adminLogin(User user) {
		// TODO Auto-generated method stub
		boolean b=false;
		
		 if(user.getEmail().equals("admin") && user.getPassword().equals("admin")){
			 b=true;
		 }
	 
	return b;	
	}
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		boolean b=false;
		List<User> users=userRepository.findAll();
		for(User user1:users) {
			if(user1.getRole().equals(user.getRole())&&user1.getEmail().equals(user.getEmail())&& user1.getPassword().equals(user.getPassword())) {
				b=true;
			}
		}
		
		return b;
	}
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
}
