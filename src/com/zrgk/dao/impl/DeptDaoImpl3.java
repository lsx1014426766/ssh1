package com.zrgk.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zrgk.dao.IDeptDao;
import com.zrgk.entity.Dept;
/**
 * 3直接使用sessionFactory工厂方式
 * 最原始的方式
 * @author lsx
 *
 */
public class DeptDaoImpl3  implements IDeptDao{
	private SessionFactory  sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public void insertDept(Dept dept) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dept);
		tx.commit();
		session.close();
	}

	@Override
	public void deleteDeptByDeptno(int deptno) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Dept dept = findDeptByDeptno(deptno);
		session.delete(dept);
		tx.commit();
		session.close();
	}


	@Override
	public List<Dept> findAll() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Dept");
		List<Dept> list = query.list();
		session.close();
		return list;
	}


	@Override
	public Dept findDeptByDeptno(int deptno) {
		Session session = sf.openSession();
		String hql ="from Dept where deptno=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, deptno);
		Dept dept = (Dept)query.uniqueResult();
		session.close();
		return dept;
	
	}

	@Override
	public void updateDept(Dept dept) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(dept);
		tx.commit();
		session.close();
	}
}
