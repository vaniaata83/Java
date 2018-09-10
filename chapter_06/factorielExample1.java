package chapter_06;

import java.util.Scanner;

public class factorielExample1 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Molq vavedete n=");
		int n= sc.nextInt();
		long factoriel =1;
		
		do{
		    factoriel*=n;
		    n--;
		}while(n>0);
		System.out.println("n!="+factoriel);
	}

}
