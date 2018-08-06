import java.util.TreeSet;

public class PersonSorting {
	public static void main(String[] args) {
//		PersonComparator pc = new PersonComparator();
//		TreeSet<Person> persons = new TreeSet<>(pc);
		
//		TreeSet<Person> persons = new TreeSet<>((p1, p2) -> p1.getAge() - p2.getAge());
		
		TreeSet<Person> persons = new TreeSet<>();
		
		persons.add(new Person("Polo", 21));
		persons.add(new Person("Lili", 19));
		persons.add(new Person("Mili", 20));
		
		persons.forEach(System.out::println);
	}
}
