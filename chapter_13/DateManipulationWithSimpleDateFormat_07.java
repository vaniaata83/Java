package chapter_13;

import java.text.SimpleDateFormat;
import java.util.Date;

//Преобразуване на дати към низове:

public class DateManipulationWithSimpleDateFormat_07 {

	public static void main(String[] args) {
//		
//		String pattern="HH часа и mm мин.";
//		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
//		Date dateNow=new Date();
//		System.out.println(dateNow);
//		String formattedDate=sdf.format(dateNow);
//		System.out.println(formattedDate);
		
//Пример за извеждане на текуща дата иден от седмицата:
		
		 String pattern1="EEEE, dd.MM.yyyy";
		 SimpleDateFormat sdf1=new SimpleDateFormat(pattern1);
		 Date dateNow1=new Date();
		 System.out.println(dateNow1);
		 String formattedDate1=sdf1.format(dateNow1);
		 System.out.println(formattedDate1);
		 
					

		
	}

}
