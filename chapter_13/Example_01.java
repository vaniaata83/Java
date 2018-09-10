package chapter_13;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		
		//СИМВОЛНИ НИЗОВЕ ПРИМЕР. ESCAPING ПРИ СИМВОЛНИТЕ НИЗОВЕ
		
//		String msg = "Stand up, stand up, Balkan superman.";
//		
//		System.out.printf("msg=\"%s\"%n", msg);
//		System.out.println();
//		System.out.printf("msg.lenght=%d%n", msg.length());
//		
//		for(int i=0; i<msg.length(); i++){
//			System.out.printf("msg[%d]=%c%n", i, msg.charAt(i));
//		}
		
		//ЧЕТЕНЕ И ПЕЧАТАНЕ НА КОНЗОЛАТА
//		Scanner sc=new Scanner(System.in);
//		String name=sc.nextLine();
//		System.out.println("Your name is "+name);
//		System.out.printf("Helllo, %S", name);
		
		// СРАВНЯВАНЕ НА НИЗОВЕ
//		String word1="Java";
//		String word2="JAVA";
//		System.out.println(word1.equals(word2));
//		System.out.println(word1.equalsIgnoreCase(word2));
//		
		String score="sCore";
		String scary="scary";
		System.out.println(score.compareToIgnoreCase(scary));
		System.out.println(scary.compareToIgnoreCase(score));
		System.out.println(scary.compareTo(score));
		
		// интересен случай
		String hello="Hello";
		String same="Hello";
		System.out.println(hello==same);// intresting- izkluchenie
		//Сравняване на стрингове се осъществява само с equals(), equalsIgnoreCase(), compareTo(), compareToIgnoreCase(),
		// груба грешка е сравнението с == на низове;
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1==str2);
		
		//Пример:
		String hel="Hel";
		String hello1="Hello";
		String copy=hel+"lo";
		System.out.println(copy==hello1);//false

	}

}
