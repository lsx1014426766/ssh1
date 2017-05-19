package com.zrgk.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.zrgk.dao.IDeptDao;
import com.zrgk.entity.Dept;
/**
 * ֱ��ע��HibernateTemplate�ķ�ʽ
 * @author lsx
 *
 */
public class DeptDaoImpl implements IDeptDao{
	private HibernateTemplate template;
	@Override
	public void insertDept(Dept dept) {
		template.save(dept);
	}
/**
 * ע��rʹ��set����
 * @param template
 */
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


	@Override
	public void deleteDeptByDeptno(int deptno) {
		Dept d = findDeptByDeptno(deptno);
//		Dept d = new Dept();
//		d.setDeptno(deptno);
		template.delete(d);
	}


	@Override
	public List<Dept> findAll() {
		return template.find("from Dept");
	}


	@Override
	public Dept findDeptByDeptno(int deptno) {
		List<Dept> list = template.find("from Dept where deptno=?",deptno);
		return list.get(0);
	}


	@Override
	public void updateDept(Dept dept) {
		template.update(dept);
	}
	
}
