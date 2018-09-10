package chapter_04;
//Изчисляване на лице на правоъгълник и на триъгълник
import java.util.Scanner;

public class CalculatingArea {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	
		System.out.println("This program caculates"+
		"the area of a reactangle or a triangle");
		
		System.out.print("Enter a and b(for rectange)"+
		"or a and h (for triangle):");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.print("Enter 1 for reactange or"+
		     " 2 for triangle:");
		int choice = sc.nextInt();
		
		double area =(double) (a*b)/choice;
		System.out.println("The area of your figure is " + area);
				
				
	}

}
