package lti.builtin;

import java.util.Random;
import java.util.function.Supplier;

import lti.domain.User;

public class DemoSupplier {
	public static void main(String[] args) {
		Supplier<String> greet = () -> "Good morning";
		
		Supplier<String> sup = new Supplier<String>() {
			@Override
			public String get() {
				return "Good morning";
			}
		};
		
		Supplier<Double> random = () -> Math.random();
		
		Supplier<Integer> random2 = () -> {
			Random rdm = new Random();
			return rdm.nextInt(5);
		};
		
		System.out.println(greet.get());
		System.out.println(sup.get());
		System.out.println(random.get());
		System.out.println(random2.get());
		System.out.println(User.userSupplier.get());
	}
}
