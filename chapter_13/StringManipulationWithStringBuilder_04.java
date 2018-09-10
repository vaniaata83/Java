package chapter_13;
/*Обръщане на низ на обратно – пример
Да разгледаме пример, в който искаме да обърнем съществуващ символен
низ на обратно. Например, ако имаме низа "ABCD", върнатият резултат ще
бъде "DCBA". Това, което ще направим, е да вземем първоначалния низ, да
го обходим отзад-напред символ по символ и да добавяме всеки символ към
променлива от тип StringBuilder*/

public class StringManipulationWithStringBuilder_04 {
	
	public static String reverseText(String text){
		StringBuilder sb=new StringBuilder();
		
		for(int i=text.length()-1; i>=0; i--){
			sb.append(text.charAt(i));	
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		String text="EM edit";
		String reversed=reverseText(text);
		System.out.println(reversed);
		//System.out.println(reverseText(text));
		
	}

}
