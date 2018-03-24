package com.chenkai.mavendemo.dao;

import java.util.List;

import com.chenkai.mavendemo.domain.Dep;

public interface IDepDao {
	public List<Dep> findDeps();
}
