package com.xiaocq.spring.service;

import java.util.List;

import com.xiaocq.domain.TwoAttributes;

public interface ParamService {
	public List<TwoAttributes> getDepartment();
	
	public List<TwoAttributes> getMajor(int departId);
	
	public List<TwoAttributes> getGrades();
	
	public List<TwoAttributes> getCategorys();
	
	public List<TwoAttributes> getScale();
}
