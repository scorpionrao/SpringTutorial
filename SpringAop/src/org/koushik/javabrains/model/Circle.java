package org.koushik.javabrains.model;

import org.koushik.javabrains.aspect.Loggable;

public class Circle {
	
	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	/** 
	 * With bean initialization -
	 * 	- Setter is called at the time of bean initialization
	 * With first setter (target) call -
	 * 	- Any @Before aspects
	 * 	- Setter (target) is called again
	 * 	- Any @After aspects
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println("Circle setter called");
		//throw(new RuntimeException());
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Circle setter called");
		return name;
	}
}
