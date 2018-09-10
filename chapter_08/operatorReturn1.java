package chapter_08;

import java.util.Scanner;

public class operatorReturn1 {
	public static int compareTo(int number1, int number2){
	if(number1>number2){
		return 1;
	}else if(number1<number2){
		return -1;
				
	}else{
		return 0;
	}
     
	}
	public static void main(String[] args){
		
		//System.out.println(compareTo(1,5));
		//System.out.println(compareTo(5,5));
		//System.out.println(compareTo(5,1));
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter x= ");
		int x=sc.nextInt();
		System.out.print("Please enter y= ");
		int y=sc.nextInt();
		System.out.println(compareTo(x,y));
		
		
		
		
	}
}