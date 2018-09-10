package chapter_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.*;

//Обработване на дати и преобразуване на низове към дати

/*Можем ли със сегашните ни знания да създадем дата от
текстова променлива? Отговорът на този въпрос е "да". Например, ако
форматът е "27.10.2008", можем да използваме метода split(…), за да
разделим съдържанието по точка; след това да обходим масива от връщани
стойности, да ги преобразуваме като цели числа с parseInt(…) на класа
Integer и да създадем нов календар, от който да вземем датата. С код
нещата биха изглеждали така:*/

public class StringManipulation_06_SimpleDateFormat {
	public static void main(String[] args){
		
	    SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
	    String userInput="27.05.1983"; // probvai s "27/05/1983"
		
		try {
			Date date = sdf.parse(userInput);
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println("Error in parsing: "+ userInput);
		}
		
		
		
		//String text="27.05.1983";
		
		//		String[] dateElements=text.split("[.]");
		//		
		//		String dayString=dateElements[0];
		//		String monthString=dateElements[1];
		//		String yearString=dateElements[2];
		//		
		//		int day=Integer.parseInt(dayString);
		//		int month=Integer.parseInt(monthString);
		//		int year=Integer.parseInt(yearString);
		//		
		//		Calendar cal = new GregorianCalendar(year, month, day);
		//		Date date=cal.getTime();
		//		System.out.println(date.toString());
		
		
		
	}

}
