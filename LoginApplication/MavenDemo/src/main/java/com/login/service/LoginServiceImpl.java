package com.login.service;

import com.login.dao.LoginDao;
import com.login.dao.LoginDaoImpl;
import com.login.model.User;

public class LoginServiceImpl implements LoginService {

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByUserIdAndPassword(User user) {
		int userid = String.valueOf(user.getUserId()).length();
		int pwd = user.getPassword().length();
		User users = null;

		if (user != null && userid > 5 && pwd > 5) {
			LoginDao loginDao = new LoginDaoImpl();
			users = loginDao.readByUserIdAndPassword(user);
			return users;
		}
		else {
		return users;
		}
	}

	@Override
	public User updateUserDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
