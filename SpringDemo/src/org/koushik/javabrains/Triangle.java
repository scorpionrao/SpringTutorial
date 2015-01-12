package org.koushik.javabrains;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * Initialization Sequence :
 * 	- Constructor for Triangle
 * 	- Setters for all Points
 * 	- Setters for Triangle
 * 	- BeanAware implementation
 * 	- ApplicationContextAware implementation
 *	- Further business logic
 */
public class Triangle implements Shape, ApplicationContextAware, BeanNameAware,
			InitializingBean, DisposableBean {
	
//	private List<Point> points;
//
//	public List<Point> getPoints() {
//		return points;
//	}
//
//	public void setPoints(List<Point> points) {
//		this.points = points;
//	}
//	
//	public void draw() {
//		for(Point point : points) {
//			System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
//		}
//	}
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public Triangle() {
		//System.out.println("Triangle Constructor");
	}
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		//System.out.println("Triangle - Inside pointA setter");
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		//System.out.println("Inside pointB setter");
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		//System.out.println("Inside pointC setter");
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getX() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getX() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getX() + ")");
	}
	/**
	 * Useful when initializing member variables from here over
	 * initializing at the time context initialization.
	 */
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		//System.out.println("Executing - ApplicationContextAware - Triangle");
		//System.out.println("Bean count: " + this.context.getBeanDefinitionCount());
		//System.out.println("Bean definitions: " + Arrays.asList(
				//this.context.getBeanDefinitionNames()).toString());
	}
	
	@Override
	public void setBeanName(String beanName) {
		//System.out.println("Executing - BeanNameAware - Triangle");
		//System.out.println("Bean name is: " + beanName);
		
	}

	/** Spring bound init that should be avoided */
	@Override
	public void afterPropertiesSet() throws Exception {
		//System.out.println("Triangle - InitializingBean - AfterPropertiesSet");
	}

	/** Spring bound init that should be avoided */
	@Override
	public void destroy() throws Exception {
		//System.out.println("Triangle - DisposableBean destroy - BeforeCustomDestroy");
	}
	
	public void myInitAfterPropertiesSet() {
		//System.out.println("Triangle - MyInit - AfterPropertiesSet");
	}
	
	public void destroyAfterDisposableBean() {
		//System.out.println("Triangle - myCleanUp - AfterDisableBeanDestroy");
	}
}
