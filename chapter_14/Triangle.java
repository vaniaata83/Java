package chapter_14;

import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("n= ");
		int n=sc.nextInt();
		sc.close();
		System.out.println();
		printTriangle(n);
		

	}
	
	private static void printLine(int start, int end){
		for(int i=start; i<=end; i++){
			System.out.print(" "+ i);
		}
		System.out.println();
	}
	
	private static void printTriangle(int n){
		for(int line=0; line<=n; line++){
			printLine(1,line);
		}
		
		for(int line=n-1; line>=0; line--){
			printLine(1, line);
		}
		System.out.println();
	}

	

}
