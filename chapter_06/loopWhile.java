package chapter_06;

import java.util.Scanner;

	public class loopWhile {
		public static void main(String[]args){
			// while loop
			int counter=0;
			
			while(counter<10){
				System.out.printf("Number: %d%n",counter);
				counter++;
				
			}
			System.out.println();
			
			//while
			
			Scanner sc =new Scanner(System.in);
			System.out.print("n=");
			int n= sc.nextInt();
			int num=1;
			int sum=1;
			System.out.print("The sum of 1");
			while(num<n){
				num++;
				sum+=num;
				System.out.printf("+%d",num);
			}
			System.out.println("="+sum);
			System.out.println();
			
			//while
			
			Scanner sc1=new Scanner(System.in);
			System.out.print("Please enter a positive number:");
			int num1=sc1.nextInt();
			int divider=2;
			int maxDivider=(int)Math.sqrt(num1);
			boolean prime =true;
			while(prime && (divider<=maxDivider)){
				if(num1 % divider==0){
					prime=false;
				}
				divider++;
				
			}
			System.out.println("Prime?"+prime);
				
		}

	}

	
		