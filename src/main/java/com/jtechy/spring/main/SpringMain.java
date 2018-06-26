package com.jtechy.spring.main;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtechy.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Ganesh");
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}
