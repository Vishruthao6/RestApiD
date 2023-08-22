package com.vishrutha.RestApiD.day3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vishrutha.RestApiD.day3.model.UserModel;

public interface Repository extends JpaRepository<UserModel,Integer> {

	boolean existsByEmail(String email);
	void deleteById(int id);
     
}