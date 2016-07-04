package _05.bean.aliasing.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _05.bean.aliasing.model.Person;

public class BeanAliasingTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("05.bean.aliasing.xml");

		Person person1 = context.getBean("name1", Person.class);
		Person person2 = context.getBean("name2", Person.class);
		Person person3 = context.getBean("name3", Person.class);
		Person person4 = context.getBean("name4", Person.class);
		Person person5 = context.getBean("name5", Person.class);
		Person person6 = context.getBean("name6", Person.class);

		System.out.println(person1 == person2);
		System.out.println(person2 == person3);
		System.out.println(person4 == person5);
		System.out.println(person5 == person6);

		// /
		System.out.println("singleton vs prototype");
		Person personSingleton = context.getBean("personSingleton", Person.class);
		Person personSingleton2 = context.getBean("personSingleton", Person.class);

		System.out.println(personSingleton == personSingleton2);

		Person personPrototype = context.getBean("personPrototype", Person.class);
		Person personPrototype2 = context.getBean("personPrototype", Person.class);

		// false doner , scope olarak prototype belirtilgidienge bu durumda
		// getBEan metodu her defasinda yeni bir bean objesi/instance i
		// olusturur.
		System.out.println(personPrototype == personPrototype2);
	}
}

// Bean Instantiation Model
// varsayilan olarka tum beanler singleton dir. yani her bean icin spring bir
// tane obje/instance olusturur.
