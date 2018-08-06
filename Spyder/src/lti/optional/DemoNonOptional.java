package lti.optional;

import java.util.Optional;

public class DemoNonOptional {
	public static void main(String[] args) {
		String expr1 = "Hello";
		String expr2 = null;
		
		System.out.println("Non-Empty: " + expr1);
		System.out.println("Empty: " + expr2);
		
		System.out.println("ofNullable on Non-Empty: " + Optional.ofNullable(expr1));
		System.out.println("ofNullable on Empty: " + Optional.ofNullable(expr2));
		
		System.out.println("of on Non-Empty: " + Optional.of(expr1));
		System.out.println("of on Empty: " + Optional.of(expr2));	// Welcome NPE
	}
}
