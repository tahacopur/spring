package _04.spel.annotation.model;

import org.springframework.stereotype.Service;

@Service("injectConfigAnnotationId")
public class InjectConfigAnnotation {

	private String name = "Levent";
	private String surname = "Erguder";
	private int birthYear = 1989;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}
