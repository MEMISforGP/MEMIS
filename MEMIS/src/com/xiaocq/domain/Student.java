package com.xiaocq.domain;

import java.io.Serializable;

/**
 * @author tinyMan Created on 2013-3-18 上午10:07:11
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 2L;
	private int stuId;
	private String stuNum;
	private String realName;
	private int grade;
	private int department;
	private int major;
	private String personalResumePath;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public String getPersonalResumePath() {
		return personalResumePath;
	}

	public void setPersonalResumePath(String personalResumePath) {
		this.personalResumePath = personalResumePath;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuNum=" + stuNum + ", realName="
				+ realName + ", department=" + department + ", major=" + major
				+ ", personalResumePath=" + personalResumePath + "]";
	}

}
