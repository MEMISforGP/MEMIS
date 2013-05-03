package com.xiaocq.spring.service;

import java.util.List;

import com.xiaocq.domain.User;

/**
 * 
 * @author tinyMan Created on 2013-3-18 下午5:21:19
 */
public interface UserService {
	public User getUserById(int userid);

	public User loginByNameAndPwd(User user);

	public void updateUser(User user);

	public void recordLastLoginDate(User user);

	public void addUser(User user);
	
	public List<User> getUserByUsername(String username);
}
