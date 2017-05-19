package com.zrgk.dao;

import java.util.List;
import com.zrgk.entity.Dept;

public interface IDeptDao {
	public void insertDept(Dept dept);
	public void updateDept(Dept dept);
	public void deleteDeptByDeptno(int deptno);
	public Dept findDeptByDeptno(int  deptno);
	public List<Dept> findAll();
}
