package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;
import com.entity.Student;

public class HomeController {
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1=apc.getBean("emp",Employee.class);
		System.out.println(emp1);
		
		System.out.println("*********************************************************");
         Student student=apc.getBean("stu",Student.class);	
         System.out.println(student);
         System.out.println("-----------------------------------------");
         System.out.println("*********Student marks***********");
         System.out.println(student.getMarks());
         System.out.println("************Student Location*****************");
         System.out.println(student.getSaddress());
         
	}

}
