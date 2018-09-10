package chapter_13;

import java.util.Date;

public class StringManipulationWithStringBuilder_05 {
	
	public static String extractCapilalLetters(String s){
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)){
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		String text="Извличане на главните букви от текст – пример"+
"Следващата задача е да извлечем всички главни букви от един текст."+
"Можем да я реализираме по различни начини – използвайки масив и"+
"пълнейки масива с всички открити главни букви; създавайки обект от тип"+
"String и долепвайки главните букви към него; използвайки класа"+
"StringBuilder.";
		System.out.println(extractCapilalLetters(text+" "));
		
		
		Date today=new Date();
		//System.out.println(today);
		System.out.println(today.toString());
		
		//Преобразуване на типове
		String text1="35";
		int value=Integer.parseInt(text1);
		System.out.println(value);
		
		String text2="tRue";
		Boolean value2=Boolean.parseBoolean(text2);
		System.out.println(value2);
		
		
		
	}

}
