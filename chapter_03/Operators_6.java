package chapter_03;

public class Operators_6 {
	public static void main(String[]args){
		
		int a =5;
		int b =7;
		String s ="Sum="+(a+b); 
		
		System.out.println(s);//12
		
		String incorrect="Sum="+a+b;
		System.out.println(incorrect); //57 (ne e pravilno,  prioriteta e ednakyv, vyrnatiq rezultat e String(dolepva gi)
		//Първо се извършва събиране на СУМ с 5 и после със 7 и резултатат е Сум 57(резултата е стринг).
		//Реда на изпълнение на операторите е от голямо значение. Ако искаме да е Сум 12 трябва да сложим скоби.
		
		System.out.println("Perimeter="+2*(a+b)+".Area="+(a*b)+".");
		
		System.out.println();
		
		//Izrazi
		
		int c=5;
		int d=++c;
		System.out.println(c);
		System.out.println(d);
		
		
		
	}

}
