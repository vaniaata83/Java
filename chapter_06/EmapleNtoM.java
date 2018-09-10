package chapter_06;

import java.util.Scanner;

//Proizvedenie na 4isla ot N do M [n....m]

public class EmapleNtoM {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Molq vavedete 4islo n= ");
		int n=sc.nextInt();
		System.out.print("Molq vavedete 4islo m= ");
		int m=sc.nextInt();
		
		int num=n;
		long product=1;
		
		
		do{
			product*=num;
			num++;
			
		}while(num<=m);
		System.out.println("product="+product);
		
	}

}
