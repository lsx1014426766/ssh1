package com.zrgk.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.entity.Dept;
import com.zrgk.service.IDeptService;

public class ListAction  extends ActionSupport{
	private IDeptService service;
	private List<Dept>  list;
	
	@Override
	public String execute() throws Exception {
		list = service.findAll();
		return super.execute();
	}

	public IDeptService getService() {
		return service;
	}

	public void setService(IDeptService service) {
		this.service = service;
	}

	public List<Dept> getList() {
		return list;
	}

	public void setList(List<Dept> list) {
		this.list = list;
	}
	
}
