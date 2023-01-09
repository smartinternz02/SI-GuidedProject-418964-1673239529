package com.bharani.flightaware.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bharani.flightaware.models.User;
import com.bharani.flightaware.models.UserIp;


public interface userRepo extends JpaRepository<User,Long> {

	User findByEmailIdIgnoreCase(String email);
	

}