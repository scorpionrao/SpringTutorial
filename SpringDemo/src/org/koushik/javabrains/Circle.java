package org.koushik.javabrains;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service - Service implementation of business layer
//@Repository - Data Object
//@Controller - MVC
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	private ApplicationEventPublisher publisher;
	
	@Autowired // by type as only 1 instance exists in xml
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	/** Check happens in Bean Post processor
	@Required
	@Autowired
	@Qualifier("circleRelated")
	*/
	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource
			.getMessage("drawing.circle", null,
				"Default Drawing Message", null));
		System.out.println(this.messageSource
			.getMessage("drawing.point", 
				new Object[] {center.getX(), center.getY()},
				"Default Center Point Message", Locale.US));
		
//		System.out.println("Circle: Point is: (" + center.getX() +
//				", " + center.getY() + ")");
		/** Getting message through bean over context */
//		System.out.println(this.messageSource
//			.getMessage("greeting", null, "Default Greeting",
//				null));
		
		MyCustomDrawEvent drawEvent = new MyCustomDrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	/** In this ApplicationContext comes as publisher */
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
