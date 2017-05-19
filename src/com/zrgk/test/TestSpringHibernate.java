package com.zrgk.test;

import java.sql.SQLException;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zrgk.entity.Dept;
import com.zrgk.service.IDeptService;
import com.zrgk.service.impl.DeptServiceImpl;

public class TestSpringHibernate {
	public static void main(String[]args) throws SQLException {
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		IDeptService service = (IDeptService)ac.getBean("deptService");
		Dept d = new  Dept();
		d.setDeptno(70);
		d.setDname("文艺5部");
		d.setLoc("北京");
		service.addDept(d);
		
	}

}
