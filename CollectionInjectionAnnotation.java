package _02.collection.injection.annotation.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("collectionAnnotationId")
public class CollectionInjectionAnnotation {

	@Resource(name="myAnnotationList")
	//Collection injection soz konusu oldugunda @Resource annotatini kullanilmalidir.
	//XML dosyasinda tanimladigimiz genel util:list tanimini buraya inject ediyoruz.
	private List<String> myList;

	@Resource(name="myAnnotationPersonList")
	private List<Person> personList;
	
	@Resource(name="myAnnotationSet")
	private Set<Integer> mySet;
	
	@Resource(name="myAnnotationMap")
	private Map<String, Object> myMap;
	
	@Resource(name="myAnnotationProperties")
	private Properties myProperties;
	public List<String> getMyList() {
		return myList;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<Integer> getMySet() {
		return mySet;
	}
	public void setMySet(Set<Integer> mySet) {
		this.mySet = mySet;
	}
	public Map<String, Object> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}
	public Properties getMyProperties() {
		return myProperties;
	}
	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}

}
