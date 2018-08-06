package lti.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoFlatMap {
	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		people.put("Jack", "Mumbai");
		people.put("John", "Pune");
		people.put("Jill", "Indore");
		
		List<String> cities = people.values().stream().map(ct -> ct.toUpperCase()).collect(Collectors.toList());
		System.out.println("-- List of cities");
		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Jack", Arrays.asList("12345","67890"));
		contacts.put("John", Arrays.asList("54321","98765"));
		contacts.put("Jill", Arrays.asList("34512","87096"));
		
//		List<String> phones = contacts.values().stream().map(Collection::stream).collect(Collectors.toList());
		
		List<String> phones = contacts.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
		phones.forEach(System.out::println);
	}
}


