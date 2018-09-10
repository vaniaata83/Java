package chapter_05;

import java.util.Scanner;

public class ContitionalStatesment_04 {
	public static void main(String[]args){
		//Вложени if-else
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers (on separete lenes)");
		int a =sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b){
			System.out.println("a=b");
		}else{
			if(a>b){
				System.out.println("The first number is greater");
			}else{
				System.out.println("The second number is greater");
			}
			
		}
	}

}
