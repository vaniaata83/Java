package chapter_04;

import java.util.Scanner;

public class PrintingLetter {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter person name:");
		String person=sc.nextLine();
		
		System.out.printf("Enter book name:");
		String book=sc.nextLine();
		
		String from = "Authours Team";
		
		System.out.printf(" Dear %s,%n",person);
		System.out.printf("We are pleased to inform "+
		   "you that \"%2$s\" is the best Bulgarian book.\n"+
				"The authors of the book wish you good luck %s!%n", person,book);
		
		System.out.println(" Yours,");
		System.out.printf(" %s", from);
		
		
	}
	

}
