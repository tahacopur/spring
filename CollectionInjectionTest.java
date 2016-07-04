package _02.collection.injection.annotation.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _02.collection.injection.annotation.model.CollectionInjectionAnnotation;
import _02.collection.injection.annotation.model.Person;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("02.collection.inject.annotation.xml");

		CollectionInjectionAnnotation bean = context.getBean("collectionAnnotationId", CollectionInjectionAnnotation.class);

		List<String> myList = bean.getMyList();

		for (String element : myList) {
			System.out.println(element);
		}
		System.out.println();

		List<Person> personList = bean.getPersonList();

		for (Person p : personList) {
			System.out.println(p);
		}
		System.out.println();

		Set<Integer> mySet = bean.getMySet();

		for (Integer i : mySet) {
			System.out.println(i);
		}
		System.out.println();
		
		Map<String,Object> myMap = bean.getMyMap();
		for(Object element : myMap.keySet()){
			System.out.println(myMap.get(element));
		}
		System.out.println();
		
		Properties properties = bean.getMyProperties();
		for(Map.Entry<Object, Object> entry:properties.entrySet() ){
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		

	}
}
