package lti.builtin;

import java.util.function.Function;

public class DemoFunction {
	
	public static String squareIt(Integer num) {
		return "Sqrt: " + (num*num);
	}
	
	public String squareItAgain(Integer num) {
		return "Sqrt: " + (num*num);
	}

	public static void main(String[] args) {
		DemoFunction demo = new DemoFunction();
		Function<Integer, String> sqrt = (val) -> "Sqrt: " + (val*val);
		Function<Integer, String> sqrt2 = DemoFunction::squareIt;
		Function<Integer, String> sqrt3 = demo::squareItAgain;
		
		System.out.println(squareIt(10));
		System.out.println(sqrt.apply(5));
		System.out.println(sqrt2.apply(7));
		System.out.println(sqrt3.apply(5));
	}
}	
