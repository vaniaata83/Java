package chapter_06;

import java.util.Scanner;

//отпечатаме на конзолата всички прости числа в интервала [N, M] bez 2-ka
public class PrimeNumbersFromNtoM {
	public static void main(String[]args){
		
	  Scanner sc =new Scanner(System.in);
	  System.out.print("Molq vavedete N= ");
	  int N = sc.nextInt();
	  System.out.print("Molq vavedete M= ");
	  int M = sc.nextInt();
	  
	  for(int i=N; i<=M; i++){
		  boolean prime=true;
		  int devider=2;
		  int maxDevider=(int) Math.sqrt(i);
		  while(devider<=maxDevider){
			  if(i % devider==0){
				  prime=false;
				  break;	 
			  }
			  devider++;
		  }
		      
			  if(prime && i!=2){
				  System.out.print(i+" ");
				 
		      }
			  
	  }
	  
		
	
	}

}
