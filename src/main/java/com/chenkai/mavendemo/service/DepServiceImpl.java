package com.chenkai.mavendemo.service;

import java.util.List;

import com.chenkai.mavendemo.dao.IDepDao;
import com.chenkai.mavendemo.domain.Dep;
import com.chenkai.mavendemo.service.impl.IDepService;

public class DepServiceImpl implements IDepService {

	private IDepDao depDao;
	
	
	
	public IDepDao getDepDao() {
		return depDao;
	}



	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
	}



	@Override
	public List<Dep> findDeps() {
		
		return depDao.findDeps();
	}

}
