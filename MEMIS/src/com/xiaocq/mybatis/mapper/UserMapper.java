package com.xiaocq.mybatis.mapper;

import java.util.List;

import com.xiaocq.domain.User;

public interface UserMapper {
	public User getUserById(int userid);
	public User loginByNameAndPwd(User user);
	public void updateUser(User user);
	public void recordLastLoginDate(User user);
	public void addUser(User user);
	
	public List<User> getUserByUsername(User user);
}
