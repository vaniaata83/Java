package chapter_04;

import java.util.Scanner;

public class ReadfromConsle {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first name:");
		String firstName=sc.nextLine();
		
		System.out.print("Please enter your last name:");
		String lastName=sc.nextLine();
		
		System.out.printf("Hello, %s %s!", firstName, lastName);
		System.out.println();
		
		System.out.print("a=");
		int a=sc.nextInt();
		
		System.out.print("b=");
		int b=sc.nextInt();
		
		System.out.printf("%d + %d = %d%n",a,b,a+b);
		System.out.printf("%d*%d=%d%n",a,b,a*b);
		
		
		
	}

}
