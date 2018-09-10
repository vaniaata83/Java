package chapter_05;

import java.util.Scanner;

public class ConditionalStatesment_03 {
	public static void main(String[]args){
		
		//If
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a=");
		int a=sc.nextInt();
		System.out.print("Please enter b=");
		int b=sc.nextInt();
		
		int max=a;
		if(b>a){
			max=b;
		}
		System.out.printf("The biggest number is %d%n",max);
		System.out.println();
		
		//if-else
		int x=3;
		if(x>3){
			System.out.println("х е по-голямо от 3");
		}
		else{
			System.out.println("х не е по-голямо от 3");
			
		
			
			
		}
		
	}

}
