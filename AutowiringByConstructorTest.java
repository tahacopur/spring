package _08.autowiring.constructor.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import _08.autowiring.constructor.model.Employee;

public class AutowiringByConstructorTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("08.autowiring.byConstructor.xml");
		
		Employee employee=context.getBean("employeeId",Employee.class);
		System.out.println(employee);
	}
}
