package com.login.service;

import com.login.model.User;

public interface LoginService {
	public abstract User createUser(User user);
	public abstract User readByUserIdAndPassword(User user);
	public abstract User updateUserDetails(User user);
	public abstract User deleteUserById(int userId);
}
