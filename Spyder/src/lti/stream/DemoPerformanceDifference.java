package lti.stream;

import java.util.ArrayList;
import java.util.List;

public class DemoPerformanceDifference {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for(int c=1;c<=1000;c++) numbers.add(c);
				
		long beginTime = System.currentTimeMillis(); 
		numbers.stream().forEach(i -> process(i));
		long endTime = System.currentTimeMillis();
		System.out.println("Stream Result: " + (endTime - beginTime) / 1000);
		
		beginTime = System.currentTimeMillis(); 
		numbers.parallelStream().forEach(i -> process(i));
		endTime = System.currentTimeMillis();
		System.out.println("Parellel Stream Result: " + (endTime - beginTime) / 1000);
	}

	private static void process(int i) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
