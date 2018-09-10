package chapter_08;

import java.util.Scanner;

public class PrintLogo {
	public static void main(String[] args){
		printLogo();
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter number:");
		int number=sc.nextInt();
		printSign(number);
		
		
		System.out.print("Please enter number1:");
		float number1=sc.nextFloat();

		System.out.print("Please enter number2:");
		float number2=sc.nextFloat();
		printMaxNumber(number1,number2);
		
	}
	public static void printLogo(){
		System.out.println("Sun Microsystems");
		System.out.println("www.sun.com");
				
	}
	public static void printSign(int number){
		if(number>0){
			System.out.println("positive");
		}else if(number<0){
			System.out.println("negative");
		}else{
			System.out.println("zero");
		}
		
	}
	public static void printMaxNumber(float number1, float number2){
		float max=number1;
		if(number2>number1){
			max=number2;
		}
		System.out.println("Maximal number is:"+ max);
		
	}

}
