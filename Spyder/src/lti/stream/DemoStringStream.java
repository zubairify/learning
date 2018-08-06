package lti.stream;

import java.util.Arrays;
import java.util.List;

public class DemoStringStream {
	public static void main(String[] args) {
		String[] cities = {"Mumbai","Pune","Indore","Bangalore","Kolkata","Chennai","Mangalore"};
		List<String> input = Arrays.asList(cities);
		
		input.stream().findFirst().ifPresent(System.out::println);
		
		input.stream().filter(ct -> ct.startsWith("M")).sorted().forEach(System.out::println);
		
		input.stream().map(ct -> ct.toUpperCase()).sorted().forEach(System.out::println);
		
		System.out.println("-- Stream output --");
		input.stream().forEach(System.out::println);
		
		System.out.println("-- Parellel Stream output --");
		input.parallelStream().forEach(System.out::println);
	}
}
