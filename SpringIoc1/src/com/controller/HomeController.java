package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.entity.Employee;
import com.entity.Order;
import com.entity.Student;

public class HomeController {
	public static void main(String[] args) {
		
		//Core container bean Factory
		
		//Resource resource = new ClassPathResource("beans.xml");
		//BeanFactory bf = new XmlBeanFactory(resource);
		//Student student =(Student) bf.getBean("stu");
		//student.StudentDetails();
		
		//j2EE container    -> application context
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		Student bean = (Student)apc.getBean("stu");
		bean.studentDetails();
		Employee bean1 = (Employee)apc.getBean("emp");
		bean1.employeeDetails();
		Order bean2 =(Order)apc.getBean("ord");
		bean2.orderDetail();
		System.out.println("end");
		
				
		
		
	}

}
