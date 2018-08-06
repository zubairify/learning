package lti.domain;

import java.util.function.Predicate;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	
	public static Predicate<Person> young = (p) -> p.getAge() >= 20;
	
	public Person() {
	}

	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tAge:" + age + "\tGender: " + gender;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
