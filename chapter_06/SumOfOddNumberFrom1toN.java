package chapter_06;

import java.util.Scanner;
//Намиране сумата на всички нечетни естествени числа в интервала [1....n], които не се делят на 7

public class SumOfOddNumberFrom1toN {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter n: ");
		int n = sc.nextInt();
		int sum =0;
		
		for(int i=1; i<=n; i+=2){
			if(i%7==0){
				continue;
			}
			sum=sum+i;//=  (sum+=i)
				
		}
		System.out.println("sum="+sum);
	}
	
}
