import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");
		
		System.out.println("-- Iterating over vector using for each");
		for (String elem : v) 
			System.out.println(elem);
		
		System.out.println("-- Iterating over vector using Iterator");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");
		
		v.addAll(lst);	// merging list into vector
		System.out.println("-- Iterating over updated vector using for each");
		for (String elem : v) 
			System.out.println(elem);
		
		//Converting vector into set
		HashSet<String> set = new HashSet<>(v);
		System.out.println("-- Iterating over Hashset using for each");
		for (String elem : set) 
			System.out.println(elem);
		
		// Converting Set into TreeSet
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("-- Iterating over Treeset using for each");
		for (String elem : tree.descendingSet()) 
			System.out.println(elem);
		
		System.out.println("-- Iterating over Treeset using Java 8 forEach()");
		// New way to iterate from Java 8
		tree.forEach(System.out::println);
		
		String[] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		List<String> days = Arrays.asList(week);
		days.forEach(System.out::println);
	}
}
