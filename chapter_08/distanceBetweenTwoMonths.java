package chapter_08;

import java.util.Scanner;

public class distanceBetweenTwoMonths {
	public static void sayMonth(int month){
		String monthName="";
		switch (month){
		case 1: monthName="January";  break;
		case 2: monthName="February"; break;
		case 3: monthName="March";    break;
		case 4: monthName="April";    break;
		case 5: monthName="May";      break;
		case 6: monthName="June";     break;
		case 7: monthName="July";     break;
		case 8: monthName="August";   break;
		case 9: monthName="September";break;
		case 10:monthName="October";  break;
		case 11:monthName="November"; break;
		case 12:monthName="December"; break;
		default:
			System.out.println("Error!");
			break;
		}
		System.out.println(monthName);
	}
	 public static void sayPeriod(int startMonth, int endMonth){
		 int period=endMonth-startMonth;
		 if(period<0){
			 period=period+12;
		 }
		 System.out.printf("There is %d month period from ", period);
		 sayMonth(startMonth);
		 System.out.print("to"+" ");
		 sayMonth(endMonth);
		 System.out.print(".");	 
	 }
	 
	 public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
		 System.out.print("First month (1-12) is: ");
		 int firstMonth=sc.nextInt();
		 System.out.print("Second month (1-12) is: ");
		 int secondMonth=sc.nextInt();
		 sayPeriod(firstMonth, secondMonth);
		 sc.close();
		 
	 }
	 

}
