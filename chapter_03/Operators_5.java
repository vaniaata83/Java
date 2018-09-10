package chapter_03;

public class Operators_5 {
	//implicit
	public static void main(String[]args){
		int myInt=5;
		System.out.println(myInt); //5
		
		long myLong=myInt;
		System.out.println(myLong); //5
		System.out.println(myLong+myInt); //5
		
		//explicit
		
		double myDouble=5.1d;           
		System.out.println(myDouble);       //5.1
		
		long myLong1 = (long)myDouble;      
		System.out.println(myLong1);         //5
		
		myDouble=5e9d;
		System.out.println(myDouble);        //5.0E9
		
		int myInt1=(int) myDouble;
		System.out.println(myInt1);           //2 147 483 647, а ние очакваме 5 000 000 000, както сме инициализирали. Това е така защото
		// в int това е максималната стойност. Затова трябва да се подбират правилно променливите, да нямаме загуба на данни
		System.out.println(Integer.MAX_VALUE); // 2 147 483647
		
		
		
		
		
	}
	

}
