package lti.optional;

import java.util.Optional;

public class DemoOptionalPresent {
	public static void main(String[] args) {
		Optional<String> expr1 = Optional.of("Hello");
		Optional<String> expr2 = Optional.empty();
		
		System.out.println(expr1.isPresent() ? "Present" : "Absent");
		System.out.println(expr2.isPresent() ? "Present" : "Absent");
		
		expr1.ifPresent(str -> System.out.println("Value Present"));
		expr2.ifPresent(str -> System.out.println("Value Present"));
	}
}
