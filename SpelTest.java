package _03.spel.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _03.spel.model.Person;

public class SpelTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("03.spel.xml");

		Person person = context.getBean("personId", Person.class);
		
		System.out.println(person);

	}
}
