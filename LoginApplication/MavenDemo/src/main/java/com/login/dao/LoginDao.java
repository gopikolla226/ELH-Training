package com.login.dao;

import com.login.model.User;

//Data Access object =jdbc= data base
public interface LoginDao {
//create () save the data
	//read() fetch the data
	//update() modify the data
	//delete() remove the data
	public abstract User createUser(User user);
	public abstract User readByUserIdAndPassword(User user);
	public abstract User updateUserDetails(User user);
	public abstract User deleteUserById(int userId);
}
