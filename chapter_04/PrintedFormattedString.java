package chapter_04;

public class PrintedFormattedString {
	public static void main(String[]args){
		
		String name="Atanas";
		int age= 35;
		String town="Dortmund";
		
		System.out.printf("My name is %s %n", name);
		System.out.printf("My name is %S %n", name);
		System.out.printf(
				"%1$s is big town. \n"+
		        "%2$s lives in %1$s. \n"+
				"%2$S is %3$d years old %n", town,name,age);
		System.out.println();
		
		int a=2, b=3;
		System.out.printf("%d + %d = ", a,b);
		System.out.printf("%d\n",(a+b));
		System.out.println();
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		
		float pi=3.14159206f;
		System.out.printf("%.2f%n",pi);//закръгляне до 2-рия знак
		System.out.printf("%.5f\n",pi);
		
		
	
		
		
				
	}
	

}
