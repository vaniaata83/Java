package chapter_08;

public class stringTips {

	public static void main(String[] args) {//stringa e obekt i ne moje da se promenq
		String str1="ivanka";
		String str2="IVANKA";
		String str3 = new String("IVANKA");
		String str4 = " ";
		String str5=str1.toUpperCase();
		String str6="atanasova";
        char str7=str6.charAt(1);		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str2==str3);
		System.out.println(str1.charAt(3));
		System.out.println(str1.codePointAt(4));
		System.out.println(str1.concat(" Atanasova"));
		System.out.println(str1.endsWith("nka"));
		System.out.println(str1.isEmpty());
		System.out.println(str1.indexOf('a'));
		System.out.println(str5.getBytes());
		System.out.println(str7);
		
		
		

	}

}
