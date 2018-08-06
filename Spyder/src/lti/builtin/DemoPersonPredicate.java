package lti.builtin;

import static lti.domain.Gender.Female;
import static lti.domain.Gender.Male;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lti.domain.Person;

public class DemoPersonPredicate {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Polo", 21, Male));
		persons.add(new Person("Lili", 19, Female));
		persons.add(new Person("Megan", 20, Female));
		persons.add(new Person("Sean", 22, Male));
		
		persons.forEach(System.out::println);
		
		Consumer<Person> pc = (p) -> System.out.println(Person.young.test(p)?p:"");
		persons.forEach(pc);
	}
}
