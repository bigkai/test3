package com.chenkai.mavendemo.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.chenkai.mavendemo.dao.IDepDao;
import com.chenkai.mavendemo.domain.Dep;

public class DepDaoImpl extends HibernateDaoSupport implements IDepDao {

	@Override
	public List<Dep> findDeps() {
		return (List<Dep>) getHibernateTemplate().find("from Dep");
	}

}
