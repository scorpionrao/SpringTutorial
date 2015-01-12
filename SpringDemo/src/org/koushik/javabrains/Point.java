package org.koushik.javabrains;

public class Point {
	private int x;
	private int y;
	
	Point() {
		//System.out.println("Point constructor");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		//System.out.println("Inside X setter");
		this.x = x;
		//System.out.println(this.x);
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		//System.out.println("Inside Y setter");
		this.y = y;
		//System.out.println(y);
	}
	
	public void myInitAfterPropertiesSet() {
		//System.out.println("Point - MyInit - AfterPropertiesSet");
	}
	
	public void destroyAfterDisposableBean() {
		//System.out.println("Point - myCleanUp - AfterBeanDestroy");
	}
	
}
