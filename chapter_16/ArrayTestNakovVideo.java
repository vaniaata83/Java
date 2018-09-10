package chapter_16;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTestNakovVideo {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] city=new String[n];
		for(int i=0;i<n;i++){
			city[i]=sc.nextLine();
		}
		
		Arrays.sort(city);
		
		for(int i=0;i<city.length;i++){
			System.out.println(city[i]);
		}

	}

}
