package com.vishrutha.RestApiD.day3.service;

import java.util.List;

import com.vishrutha.RestApiD.day3.model.UserModel;

public interface UserService {
    public boolean addUser(UserModel user);
    
    public boolean updateUse(UserModel user);
	List<UserModel> getUser();
     public boolean deleteUser(int id);
	boolean updateUser1(int id, UserModel user);

	boolean updateUser(int id, UserModel user);
}
