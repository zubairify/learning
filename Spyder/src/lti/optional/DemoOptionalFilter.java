package lti.optional;

import java.util.Optional;

public class DemoOptionalFilter {
	public static void main(String[] args) {
		Optional<String> expr1 = Optional.of("Hello");
		Optional<String> expr2 = Optional.empty();
		
		System.out.println("ofNullable on Empty: " + Optional.ofNullable(expr2));
		System.out.println("of on Empty: " + Optional.of(expr2));
		
		System.out.println(expr1.filter(str -> str.equals("hello")));
		System.out.println(expr1.filter(str -> str.equals("Hello")));
		
		System.out.println(expr2.filter(str -> str.equals("hello")));
	}
}
