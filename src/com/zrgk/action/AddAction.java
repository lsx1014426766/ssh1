package com.zrgk.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zrgk.entity.Dept;
import com.zrgk.service.IDeptService;

public class AddAction extends ActionSupport{
	private int deptno;
	private String dname;
	private String loc;
	private IDeptService service;
	@Override
	public String execute() throws Exception {
		Dept d = new Dept();
		d.setDeptno(deptno);
		d.setDname(dname);
		d.setLoc(loc);
		service.addDept(d);
		return "success";
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public IDeptService getService() {
		return service;
	}


	public void setService(IDeptService service) {
		this.service = service;
	}
}
