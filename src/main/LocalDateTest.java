package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String[] args) {


		LocalDate l = LocalDate.now();
		
		System.out.println(l);
		
	    LocalTime l2 = LocalTime.now();
		
		System.out.println(l2);
		
		LocalDateTime l3 = LocalDateTime.now();
		
		System.out.println(l3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

		System.out.println(l3.getDayOfMonth());
	}

}
