package com.zrgk.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zrgk.dao.IDeptDao;
import com.zrgk.entity.Dept;
//  HibernateDaoSupport���װ�� HibernateTmplate�������(hibernateTemplate) �Ͷ�Ӧ��set����
/**
 * �̳�HibernateDaoSupport�ķ�ʽ
 * @author lsx
 *
 */
public class DeptDaoImpl2   
		extends HibernateDaoSupport   implements IDeptDao{
	@Override
	public void insertDept(Dept dept) {
		this.getHibernateTemplate().save(dept);
	}

	@Override
	public void deleteDeptByDeptno(int deptno) {
		Dept d = findDeptByDeptno(deptno);
//		Dept d = new Dept();
//		d.setDeptno(deptno);
		this.getHibernateTemplate().delete(d);
	}


	@Override
	public List<Dept> findAll() {
		return this.getHibernateTemplate().find("from Dept");
	}


	@Override
	public Dept findDeptByDeptno(int deptno) {
		List<Dept> list = this.getHibernateTemplate().find("from Dept where deptno=?",deptno);
		return list.get(0);
	}

	@Override
	public void updateDept(Dept dept) {
		this.getHibernateTemplate().update(dept);
	}
}
