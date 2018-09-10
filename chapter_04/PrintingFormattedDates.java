package chapter_04;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PrintingFormattedDates {
	public static void main(String[]args){
		System.out.printf("The time is: %1$tH:%1$tM:%1$tS.\n", new java.util.Date());
		
		Date date=new Date();
		System.out.printf("The date in Day/Month/Year is: %1$td/ %1$tm/ %1$ty. \n", date);
		System.out.printf("The date and time is: %1$tA  %1$tI : %1$tM %1$tB /%1$tY", date);
		System.out.println();
		
		//more example
		long n = 120582;
		System.out.format("%d%n",n);     //   120582
		System.out.format("%08d%n",n);   //001250582
		System.out.printf("%+8d%n", n);  //  +120582
		
		double pi=Math.PI;
		System.out.format("%f%n",pi);          //3.141593
		System.out.format("%.3f%n", pi);       //3.142
		System.out.format("%10.3f%n", pi);     //      3.142
		System.out.format("%-10.3f%n",pi);   //3.142
		System.out.format(Locale.ITALIAN,"%-10.4f%n%n",pi); //3,1416
		System.out.format(Locale.GERMANY,"%-10.4f%n%n",pi); //3,1416
		System.out.format(Locale.JAPANESE,"%-10.4f%n%n",pi);//3.1416
		System.out.format(Locale.ENGLISH,"%-10.4f%n%n",pi); //3.1416
		
		
		Calendar c =Calendar.getInstance();
		System.out.printf("%tB %te, %tY",c,c,c);
		System.out.println();
		System.out.printf("%1$tB %1$te, %1$tY",c);
		System.out.println();
		System.out.printf("%tl:%tM:%tS %tp %n",c,c,c,c);
		System.out.println();
		
		//Форматиращи низове и локализация
		Locale.setDefault(Locale.US);
		System.out.println("Locale:" +Locale.getDefault().toString());
		System.out.printf("%.2f\n",1234.56);
		System.out.printf("%1$tA %1$tH : %1$tM %1$tp %1$tB - %1$tY.\n",new Date());
		
		System.out.println();
		
		Locale.setDefault(new Locale("bg", "BG"));
		System.out.println("Locale:"+Locale.getDefault().toString());
		System.out.printf("%.2f\n", 1234.56);
		System.out.printf("%1$tA %1$tH : %1$tM  %1$tB - %1$tY.", new Date());
		
		
		
		
		
		
		
		
		
	}

}
