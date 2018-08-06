package lti.sam;

public class TestMaxFinder {
	static MaxFinder max = (int a, int b) -> {
		return a > b ? a : b;
	};
	
	static MaxFinder max2 = (a, b) -> a > b ? a : b;

	public static void main(String[] args) {
		System.out.println(max.maximum(50, 20));
		
		System.out.println(max2.maximum(10, 30));
	}
}
