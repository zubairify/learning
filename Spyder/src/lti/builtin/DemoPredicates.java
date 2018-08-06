package lti.builtin;

import java.util.function.Predicate;

import lti.domain.Gender;
import lti.domain.Person;

public class DemoPredicates {
	public static void main(String[] args) {
		Predicate<Integer> checkNegative = (num) -> num < 0;
		System.out.println(checkNegative.test(3));
		
		Person p = new Person("Polo", 21, Gender.Male);
		Predicate<Person> teen = (pers) -> pers.getAge() <= 19;
		
		System.out.println(teen.test(p));
		System.out.println(Person.young.test(p));
		
		
	}
}
