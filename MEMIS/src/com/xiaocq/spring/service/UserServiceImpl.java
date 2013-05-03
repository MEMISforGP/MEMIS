package com.xiaocq.spring.service;

import java.util.List;

import com.xiaocq.domain.User;
import com.xiaocq.mybatis.mapper.UserMapper;

public class UserServiceImpl implements UserService {
	private UserMapper userDao;

	public UserMapper getUserDao() {
		return userDao;
	}

	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public User getUserById(int userid) {
		return userDao.getUserById(userid);
	}

	public User loginByNameAndPwd(User user) {
		return userDao.loginByNameAndPwd(user);
	}

	public void recordLastLoginDate(User user) {
		userDao.recordLastLoginDate(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	public List<User> getUserByUsername(String username){
		User user = new User();
		user.setUsername(username);
		
		List<User> users = userDao.getUserByUsername(user);
		return users;
	}

}
