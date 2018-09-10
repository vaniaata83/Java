package chapter_03;

import java.util.Scanner;

public class Operators_1 {
	public static void main(String[]argv){
		//!!!!!Warning!!!!!!!
		System.out.println(5+5);
		System.out.println(""+5+5);
		System.out.println(5+5+"");
		
		System.out.println();
		
		int z= 4 + 8;
		System.out.println(z);
		System.out.println();
		
		//Primeri
		
		int squarePerimeter = 17;
		double squareSide = squarePerimeter/4.0; //Probvai samo s 4, razbira go kato int i pravi delene bez da vzima ostatyk
		double squareArea =squareSide*squareSide;
		System.out.println(squareSide);
		System.out.println(squareArea);
		
		
		
		int a=5;
		int b=4;
		System.out.println(a+b);//9
		System.out.println(a+b++);//9
		System.out.println(a+b);//10
		System.out.println(a+(++b));//10
		System.out.println(a+b);//9
		System.out.println(14/a);//2
		System.out.println(14 % a);//4 zashto e taka, ne trqbva li da e (14%5=2.8) 8?
		
		
		System.out.println();
		int c, e;
		c=10;
		System.out.println(e=(c==1) ? 20:30);
		
		System.out.println();
		
		//Sum N int
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int n=sc.nextInt();
		
		
		long sum=0;
		for(int i=0; i<n;i++){
			sum+=sc.nextInt();
			//System.out.println("Sum="+sum);
			
		}
		
		System.out.println("Sum="+sum);
		

	}
}