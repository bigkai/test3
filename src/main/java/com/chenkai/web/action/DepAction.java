package com.chenkai.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.chenkai.mavendemo.domain.Dep;
import com.chenkai.mavendemo.service.impl.IDepService;
import com.opensymphony.xwork2.ActionSupport;

public class DepAction extends ActionSupport{
	private IDepService depService;

	public IDepService getDepService() {
		return depService;
	}

	public void setDepService(IDepService depService) {
		this.depService = depService;
	}
	
	public String find() {
		List<Dep> deps = depService.findDeps();
		ServletActionContext.getRequest().setAttribute("list", deps);
		return "list";
	}
}
