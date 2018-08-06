package lti.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DemoLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime yesterday = LocalDateTime.of(LocalDate.of(2018, 07, 24), LocalTime.of(15, 15));
		System.out.println(yesterday);
		
		LocalDate today = now.toLocalDate();
		System.out.println(today);
		System.out.println(now.toLocalTime());
		
		Date dt = new Date();
		System.out.println(dt);

		LocalDateTime ldt = LocalDateTime.ofInstant(dt.toInstant(), ZoneId.systemDefault());
		System.out.println(ldt.toLocalDate());
		System.out.println(ldt.toLocalTime());
	}
}
