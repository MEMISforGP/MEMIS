package com.xiaocq.spring.service;

import java.util.List;

import com.xiaocq.domain.TwoAttributes;
import com.xiaocq.mybatis.mapper.ParamMapper;

public class ParamServiceImpl implements ParamService{
	
	private ParamMapper paramDao;
	
	public ParamMapper getParamDao() {
		return paramDao;
	}

	public void setParamDao(ParamMapper paramDao) {
		this.paramDao = paramDao;
	}

	@Override
	public List<TwoAttributes> getDepartment() {
		return paramDao.getDepartment();
	}

	@Override
	public List<TwoAttributes> getMajor(int deptId) {
		return paramDao.getMajor(deptId);
	}

	@Override
	public List<TwoAttributes> getGrades() {
		return paramDao.getGrades();
	}

	@Override
	public List<TwoAttributes> getCategorys() {
		return paramDao.getCategorys();
	}

	@Override
	public List<TwoAttributes> getScale() {
		return paramDao.getScale();
	}

}
