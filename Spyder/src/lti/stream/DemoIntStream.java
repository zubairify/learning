package lti.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DemoIntStream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,7,5,9,2,6,3);
		numbers.forEach(System.out::println);
		
		// Intermediate Operations
		System.out.println("--- Distinct stream data");
		numbers.stream().distinct().forEach(System.out::println);
		
		System.out.println("--- Filter stream data");
		numbers.stream().filter(n -> n>5).forEach(System.out::println);
		
		System.out.println("--- Limit stream data");
		numbers.stream().limit(4).forEach(System.out::println);
		
		System.out.println("--- Filter stream data");
		numbers.stream().distinct().sorted().forEach(System.out::println);

		// Terminal Operations
		System.out.println("Sum: " + numbers.stream().reduce(0, Integer::sum));
		System.out.println("Count: " + numbers.stream().count());
		
		IntStream.range(1, 10).forEach(System.out::println);
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		System.out.println(IntStream.range(1, 10).sum());
	}
}
