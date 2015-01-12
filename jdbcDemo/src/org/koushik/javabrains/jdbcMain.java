package org.koushik.javabrains;

import org.koushik.javabrains.dao.HibernateDaoImpl;
import org.koushik.javabrains.dao.SimpleJdbcDaoImpl;
import org.koushik.javabrains.dao.jdbcDaoImpl;
import org.koushik.javabrains.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//SimpleJdbcDaoImpl dao = ctx.getBean("simpleJdbcDaoImpl", SimpleJdbcDaoImpl.class);
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		
		//Circle circle = dao.getCircle(1);
		//System.out.println(circle.getName());
		//System.out.println(dao.getCircleForId(1).getName());
		//dao.insertCircle(new Circle(5, "Fifth Circle"));
		//System.out.println(dao.getAllCircles().size());
		//dao.createTriangleTable();
		
		System.out.println(dao.getCircleCount());
	}
}
