package com.zrgk.test;


import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * alter table paper 

ͨ����Ŀ�е������ļ������ɱ�ṹ
 * @author lsx
 * @Description 
 *
 */
public class ExportDB {
	public static void main(String[] args) {
		//��ȡhibernate.cfg.xml�ļ�
		//ע�⣺Ĭ�ϲ���·��Ϊ/hibernate.cfg.xml
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		///hibernate.cfg.xml not found
		//cfg.configure("/config/hibernate/hibernate.cfg.xml");
		//cfg.addResource("/config/hibernate/hibernate.cfg.xml");
		//cfg.addFile("config/hibernate/hibernate.cfg.xml");
		//hbm2ddl
		SchemaExport export = new SchemaExport(cfg);
		//void org.hibernate.tool.
		//hbm2ddl.SchemaExport.create(boolean script, boolean export)
		export.create(true, true);
		}
}
