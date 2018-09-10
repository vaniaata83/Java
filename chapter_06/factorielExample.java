package chapter_06;

import java.util.Scanner;

public class factorielExample {
	public static void main(String[]args){
		System.out.print("Molq vavedete 4islo:");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		long factoriel =1;
		
		while(true){
			if(n==1){
				break;
			}
			factoriel*=n;
			n--;
		}
		
		System.out.println("n!="+factoriel);
	}

}
