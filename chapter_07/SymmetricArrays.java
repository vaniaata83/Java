package chapter_07;

import java.util.Scanner;

public class SymmetricArrays {
	
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter n= ");
	int n=sc.nextInt();
	int [] vani=new int[n];
	
	System.out.println("Please enter elements of array:");
	for(int i=0; i<n; i++){
		System.out.print("vani["+i+"] = ");
		vani[i]=sc.nextInt();
		
	}

	boolean symmetric = true;
	for(int i=0; i<(vani.length-1)/2; i++){
		if(  vani[i] != vani[n-i-1]){
		symmetric=false;
		}

          
	}
	System.out.printf("Symmetric? %b%n", symmetric);
	}

}
