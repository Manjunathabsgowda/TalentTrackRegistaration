package com.bitlabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.entity.User;

 


@Repository
public interface UserRepositary extends JpaRepository<User, Integer> {

 

}