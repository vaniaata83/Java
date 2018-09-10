package chapter_08;

import java.util.Scanner;

public class printTraingle {
	public static void main(String[]args){
		System.out.print("Please enter n= ");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println();
		
		
		for(int line=1;line<=n;line++){
			printLine(1,line);		
		}
		for(int line= n-1; line>=1;line--){
			printLine(1,line);
		}
		
	}

	private static void printLine(int start, int end) {
		for(int i=start; i<=end;i++){
			System.out.print(" "+i);
		}
		System.out.println();
	
		
	}
	


	}

