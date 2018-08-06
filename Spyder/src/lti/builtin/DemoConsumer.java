package lti.builtin;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,4,5,6);
		
		Consumer<Integer> printer = System.out::println;
		numbers.forEach(printer);
		
		Consumer<Integer> squarer = (num) -> System.out.println(num*num);
		numbers.forEach(squarer);
		
	}
}
