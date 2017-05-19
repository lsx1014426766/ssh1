package com.zrgk.test;


import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * alter table paper 

通过项目中的配置文件，生成表结构
 * @author lsx
 * @Description 
 *
 */
public class ExportDB {
	public static void main(String[] args) {
		//读取hibernate.cfg.xml文件
		//注意：默认查找路径为/hibernate.cfg.xml
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
