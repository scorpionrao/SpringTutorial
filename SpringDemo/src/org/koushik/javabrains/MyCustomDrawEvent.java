package org.koushik.javabrains;

import org.springframework.context.ApplicationEvent;

public class MyCustomDrawEvent extends ApplicationEvent {

	public MyCustomDrawEvent(Object source) {
		super(source);
	}
	
	public String toString() {
		return "Draw Event Occured";
	}

}
