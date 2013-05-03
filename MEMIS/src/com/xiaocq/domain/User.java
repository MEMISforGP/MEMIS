/**
 * 
 */
package com.xiaocq.domain;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author tinyMan Created on 2013-3-18 上午9:04:51
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private String userType;
	private Date registerDate;
	private Date lastLoginDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", userType=" + userType + ", registerDate="
				+ registerDate + ", lastLoginDate=" + lastLoginDate + "]";
	}

}
