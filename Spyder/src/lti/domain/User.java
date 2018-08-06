package lti.domain;

import java.util.function.Supplier;

public class User {
	private String name, city;
	
	public User() {
	}

	public User(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public static Supplier<User> userSupplier = () -> new User("Zubair", "Thane");
	
	@Override
	public String toString() {
		return "Name: " + name + "\tCity: " + city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
