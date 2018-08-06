package lti.builtin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static lti.domain.Gender.*;
import lti.domain.Person;

public class DemoPersonConsumer {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Polo", 21, Male));
		persons.add(new Person("Lili", 19, Female));
		persons.add(new Person("Megan", 20, Female));
		persons.add(new Person("Sean", 22, Male));

		persons.forEach(System.out::println);

		Consumer<Person> title = (Person p) -> System.out.print((p.getGender() == Male ? "Mr." : "Ms.") + p.getName());
//		persons.forEach(title);
//		persons.forEach(title::accept);
//		persons.forEach((p) -> title.accept(p));
		
		Consumer<Person> age = title.andThen(p -> System.out.println(" Age: " + p.getAge()));
		persons.forEach(age);
	}
}
