package chapter_08;

import java.util.Scanner;

public class printTriangle1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number n:");
		int n=sc.nextInt();
		sc.close();
		
		printTriangle1(n);
		
	}
	private static void vani(int start, int end) {
		for(int i=start; i<=end;i++){
			System.out.print(i);
		}
	}
	private static void printTriangle1(int n){
		System.out.println();
		for (int line=1;line<=n;line++){
			vani(1,line);// str.263
		}
		for(int line=n-1;line>=1;line--){
			vani(1,line);// str.263	
		}
		
		
	}

}
