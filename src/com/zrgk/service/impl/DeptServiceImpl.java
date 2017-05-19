package com.zrgk.service.impl;

import java.util.List;

import com.zrgk.dao.IDeptDao;
import com.zrgk.entity.Dept;
import com.zrgk.service.IDeptService;

public class DeptServiceImpl implements IDeptService {
	private IDeptDao deptDao;
	
	
	@Override
	public void addDept(Dept d) {
		deptDao.insertDept(d);
		//ģ�����
//		String s = null;
//		s.length();
//		Dept dept = new Dept();
//		dept.setDeptno(250);
//		dept.setDname("aaaa");
//		dept.setLoc("bbbb");
//		deptDao.insertDept(dept);
		
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public void init(){
		System.out.println("DeptServiceImpl��ʼ��������������");
	}
	
	public  void destroy(){
		System.out.println("DeptServiceImpl�����١�����������");
	}

	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}

}
