package com.zrgk.test;


import org.hibernate.cfg.AnnotationConfiguration;
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
		/**
		 * 通過xml配置文件的形式 
		 */
		/*Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		//hbm2ddl
		SchemaExport export = new SchemaExport(cfg);
		//void org.hibernate.tool.
		//hbm2ddl.SchemaExport.create(boolean script, boolean export)
		export.create(true, true);*/
		
		/**
		 * Error:An AnnotationConfiguration instance is required to use <mapping class="com.pb.entity.Group"/>
		 * 需要用注解类AnnotationConfiguration！！！！
		 * 注意：下面这种方式同时可以处理上面的xml形式，但是上面的方法不支持注解的形式！！！
		 * 通过注解的形式
		 *  alter table users 
        drop 
        foreign key FK6A68E084F78AB7E
14:27:19,702 DEBUG SchemaExport:377 - 
    alter table users 
        drop 
        foreign key FK6A68E084F78AB7E
14:27:19,703 DEBUG SchemaExport:362 - Unsuccessful: alter table users drop foreign key FK6A68E084F78AB7E
14:27:19,704 DEBUG SchemaExport:363 - Table 'test.users' doesn't exist

    drop table if exists groups
14:27:19,704 DEBUG SchemaExport:377 - 
    drop table if exists groups

    drop table if exists users
14:27:19,707 DEBUG SchemaExport:377 - 
    drop table if exists users

    create table groups (
        id varchar(32) not null,
        name varchar(255),
        userNum integer,
        primary key (id),
        check (userNum>=0)
    )
14:27:19,708 DEBUG SchemaExport:377 - 
    create table groups (
        id varchar(32) not null,
        name varchar(255),
        userNum integer,
        primary key (id),
        check (userNum>=0)
    )

    create table users (
        id varchar(32) not null,
        password varchar(255),
        username varchar(255),
        group_id varchar(32),
        primary key (id)
    )
14:27:20,164 DEBUG SchemaExport:377 - 
    create table users (
        id varchar(32) not null,
        password varchar(255),
        username varchar(255),
        group_id varchar(32),
        primary key (id)
    )

    alter table users 
        add index FK6A68E084F78AB7E (group_id), 
        add constraint FK6A68E084F78AB7E 
        foreign key (group_id) 
        references groups (id)
14:27:20,548 DEBUG SchemaExport:377 - 
    alter table users 
        add index FK6A68E084F78AB7E (group_id), 
        add constraint FK6A68E084F78AB7E 
        foreign key (group_id) 
        references groups (id)
		 */
		
		 AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		 SchemaExport export = new SchemaExport(cfg);
		 export.create(true, true);
		}
}
