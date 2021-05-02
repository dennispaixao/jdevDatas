package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class PeriodTest {
	
	public static void main(String[] args) {
		
		LocalDate l1 = LocalDate.of(2020, 10, 2);
		LocalDate l2 = LocalDate.of(2021,12,5);
		
		Period p = Period.between(l1, l2);
		
		System.out.println(p.getYears()+"-"+p.getMonths()+"-"+p.getDays());
	
		
	}

}
