package lti.optional;

import java.util.Optional;

public class DemoOrElseOptional {
	public static void main(String[] args) {
		Optional<String> expr1 = Optional.of("Hello");
		Optional<String> expr2 = Optional.empty();
		
		System.out.println(expr1.orElse("Oops"));
		System.out.println(expr2.orElse("Hola"));
		
		System.out.println(expr1.orElseGet(() -> "N/A"));
		System.out.println(expr2.orElseGet(() -> "Bonjour"));
	}
}
