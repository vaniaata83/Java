package chapter_08;

import java.util.Scanner;

public class DataValidation {
	public static void main(String[] args){
		
		System.out.println("What time is it?");
		Scanner sc=new Scanner(System.in);
		System.out.print("Hours: ");
		int hours=sc.nextInt();
		System.out.print("Minutes: ");
		int minutes=sc.nextInt();
		
		boolean isValidTime=validateHours(hours)&&validateMinutes(minutes);
		if(isValidTime){
			
		System.out.printf("The time is %d:%d",hours, minutes);
			
		}else {
			System.out.println("Incorrect time");
		}
	}
	
	public static boolean validateHours(int hours){
		boolean result=(hours>=0)&&(hours<24);
		return result;
	}
	public static boolean validateMinutes(int minutes){
		boolean result=(minutes>=0)&&(minutes<59);
		return result;
	}

}
