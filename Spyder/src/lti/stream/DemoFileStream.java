package lti.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoFileStream {
	public static void main(String[] args) throws Exception {
		Stream<String> movies = Files.lines(Paths.get("src/movies.txt"));
		movies.sorted().forEach(System.out::println);
		
		Files.lines(Paths.get("src/movies.txt")).filter(m -> m.contains("Ra")).forEach(System.out::println);
		
		List<String> favMovies = Files.lines(Paths.get("src/movies.txt"))
				.filter(m -> m.startsWith("R")).collect(Collectors.toList());
		
		favMovies.forEach(System.out::println);
		movies.close();
		
		Stream<String> d1 = Files.lines(Paths.get("src/data.txt"));
		long rows = d1.map(r -> r.split(",")).filter(ar -> ar.length == 3).count();
		System.out.println("Complete Records: " + rows);
		
		Stream<String> d2 = Files.lines(Paths.get("src/data.txt"));
		d2.map(r -> r.split(",")).filter(x -> x.length == 3).filter(ar -> Integer.parseInt(ar[1]) > 5)
			.forEach(row -> System.out.println(row[0] + " " + row[1] + " " + row[2]));
		
		Stream<String> d3 = Files.lines(Paths.get("src/data.txt"));
		Map<String, Integer> map = d3.map(r -> r.split(",")).filter(x -> x.length == 3)
									.filter(ar -> Integer.parseInt(ar[1]) > 5)
									.collect(Collectors.toMap(row -> row[0], row -> Integer.parseInt(row[1])));
		
		map.forEach((k,v) -> System.out.println(k +": " + v)); 
	}
}



