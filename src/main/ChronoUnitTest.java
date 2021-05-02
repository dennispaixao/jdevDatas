package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class ChronoUnitTest {
	
	public static String bissexto(int year) throws ParseException {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("28/02/"+year));
		Calendar c2 = Calendar.getInstance();
		c2.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("1/03/"+year));
		LocalDate cdate1= LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(c1.getTime()));
		LocalDate cdate2= LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(c2.getTime()));
		
		long dias = ChronoUnit.DAYS.between(cdate1,cdate2);
		
		if(dias == 2) {
			return "bissexto";
		}else {
			return"não bissexto";
		}
		
	}

	public static void main(String[] args) throws ParseException {
		System.out.println(bissexto(2027));
	
	}

}
