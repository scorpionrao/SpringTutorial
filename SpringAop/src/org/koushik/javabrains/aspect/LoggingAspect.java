package org.koushik.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.koushik.javabrains.model.Circle;

/** 
 *  Converts class to aspect 
 *  Methods of the class becomes advice 
 */
@Aspect
public class LoggingAspect {
	
//	@Before(value = "execution(public String org.koushik.javabrains.model.Circle.getName())")
	
	/** 
	 * One Advice - any method that starts with "get" 
	 *  One Advice - any method that returns any object type
	 *  One Advice - get*(*) - any get method that has 1 or more arguments.
	 *  One Advice - get*(..) - any get method that has 0 or more arguments.
	 *  
	 *  Same Advice - Different points - wild cards
	 *  One Pointcut - Multiple advice (methods) - dummy method
	 *  One Pointcut - Advice depending on condition
	 *  Pointcut - Point where you want the advise to cut in
	 *  
	 */
//	@Before(value = "execution(public * get*(..))")
//
//	
//	Apply pointcut to all classes within root package and sub-packages
//	@Pointcut("within(org.koushik.javabrains.model..*)")
//	@Pointcut("within(org.koushik.javabrains.model.Circle)")
//	public void allCirclemethods() {}
//	
//	@Pointcut(args("org.koushik.javabrains.model.Circle"))
//	public void methodsWithCircleArgument() {}
//	
//	/** Where the point has to cut in */
//	@Before("allGetters() && allCirclemethods()")
//	public void LoggingAdvice(JoinPoint joinPoint) {
//		//System.out.println(joinPoint.toString());
//		//System.out.println(joinPoint.getTarget());
//		// gives control of the actual object
//		Circle circle = (Circle) joinPoint.getTarget();
//	}
//	
//	@Before("allGetters()")
//	public void secondAdvice() {
//		//System.out.println("Second Advice executed");
//	}
//	
//	/** The value that is passed is accessible in the advice */
//	@Before("args(name)")
//	public void stringArgumentMethods1(String name) {
//		System.out.println("@Before aspect method that takes String arguments has been called. The value is " + name);
//	}
//	
//	/** Always runs irrespective of fail or pass */
//	@After("args(name)")
//	public void stringArgumentMethods2(String name) {
//		System.out.println("@After aspect method that takes String arguments has been called. The value is " + name);
//	}
//	
//	@AfterReturning(pointcut="args(name)", returning="returnString")
//	public void stringArgumentMethods3(String name, Object returnString) {
//		System.out.println("@AfterReturning aspect method that takes String arguments has been called."
//				+ " The value is " + name + ". The output value is " + returnString);
//	}
//	
//	@AfterThrowing(pointcut="args(name)", throwing="ex")
//	public void exceptionAdvice(String name, RuntimeException ex) {
//		System.out.println("An exception has been thrown - " + ex);
//	}
//	
//	
//	@Around("allGetters()")
//	@Around("@annotation(org.koushik.javabrains.aspect.Loggable)")
//	/** requires at least once advice */
//	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
//		Object returnValue = null;
//		try {
//			System.out.println("Before advice");
//			// returnValue can be modified unlike @AfterReturning
//			returnValue = proceedingJoinPoint.proceed();
//			System.out.println("After Returning");
//		} catch (Throwable e) {
//			e.printStackTrace();
//			System.out.println("After Throwing");
//		}
//		System.out.println("After Finally");
//		return returnValue;
//	}
//	
//	/** Expression */
//	@Pointcut("execution(* get*())")
//	public void allGetters() {}
//
//
	
	public void loggingAdvice() {
		System.out.println("Logging from advice");
	}
}
