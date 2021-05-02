package main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Data {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		Date d = new Date();
		
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime());
		
		/*---date format --- */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("data em formato para banco de dados: "+simpleDateFormat.format(d));
		System.out.println("data em formato para banco de dados Calendar: "+simpleDateFormat.format(calendar.getTime()));
		
		//parse de texto para data
		
		Date de = simpleDateFormat.parse("22/3/1920 22:02.22");
		System.out.println(de);
		
		//somando ao mês
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("22/06/2020"));
		
		c.add(Calendar.MONTH, 1);
		System.out.println(c.getTime());
	}
}
		
		
		
		
		
		
		

