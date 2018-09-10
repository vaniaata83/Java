package chapter_06;

import java.util.Scanner;

public class ExampleMnaN {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Molq vavedete 4islo n= ");
		int n=sc.nextInt();
		System.out.print("Molq vavedete 4islo m= ");
		int m=sc.nextInt();
		 long result =1;
		 
		 for(int i=0; i<m; i++){
			 result*=n;
					 
			 
		 }
		 System.out.print("n^m="+result);
		 
		
	}

}
