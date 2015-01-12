package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
		//ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		/** Uses application context over bean to retrieve data */
//		System.out.println(
//			context.getMessage("greeting", null, "Default Greeting",
//				null)
//		);
	}

}
