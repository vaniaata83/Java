package chapter_13;

import java.util.Date;



//Замяна на подниз с друг

public class StringManipulation_02 {
	
	public static void main(String[] args){
		System.out.println(new Date());
		
		String doc="Hello, vania_ata@abv.bg, "
				+"you have been using vania_ata@abv.bg in your registration.";
		
		String fixedDoc=doc.replace("vania_ata@abv.bg", "vania_ata@icloud.com");
		System.out.println(fixedDoc);
		
		// Замяна на телефони със звездички:
		
		String doc1="Smith's number: 0892880022 \n"+
		"Francy can be found at 0853445566 \n"+
				"so as Steven - 0811654321";
		
		String replacedDoc= doc1.replaceAll("(08)[0-9]{8}", "$1********");
		System.out.println(replacedDoc);
		
		
		//Преминаване към главни или малки букви
		String text="All kind of LeTTers";
		System.out.println(text.toLowerCase());
		
		String pass1="Parola";
		String pass2="PaRola";
		String pass3="parola";
		boolean isEqual;
		isEqual=pass1.equalsIgnoreCase("PAROLA");
		System.out.println(isEqual);
		isEqual=pass1.toUpperCase().equals("PAROLA");
		System.out.println(isEqual);
		isEqual=pass2.toUpperCase().equals(pass2);
		System.out.println(isEqual);
		isEqual=pass3.toUpperCase().equals("PAROLA");
		System.out.println(isEqual);
		
		//Премахване на празно пространство в края на низ
		String fileData="       \n\n   Mario Peshev";
		System.out.println(fileData);
		String reduced=fileData.trim();
		System.out.println(reduced);
		//Долепяне на низове в цикъл- НИГОГА ДА НЕ СЕ ПРАВИ!!! Primer: Проблеми с
		//производилността- мн. забавя изпълнението на програмата затова конкатенацията на Стрингове в цикъл
		// се реализира с използването на класа StringBuilder.
		System.out.println(new Date());
		String collector="Numbers: ";
		for(int idx=1; idx<=5000; idx++){
			collector+=idx;
		}
		System.out.println(collector.substring(0, 1024));
		System.out.println(new Date());

	
		
		
		
		
				
		
		
		
	}

}
