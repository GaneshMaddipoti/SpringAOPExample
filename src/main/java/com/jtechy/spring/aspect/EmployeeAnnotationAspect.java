package com.jtechy.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAnnotationAspect {

	@Around("execution(* com.jtechy.spring.model.Employee.setName(*))")
	public void myAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Executing before myAdvice!!");
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Executing after myAdvice!!");
	}
}
