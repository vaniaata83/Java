package chapter_16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_RegularExpressions {

	
	//http://regexr.com/

	public static void main(String[] args) {
		String text=
		"Hello, my number in Sofiq s +359 894 11 22 33,"+
		"but in Munich my number is +49 89 975-99222.";
		
		String phoneRegEx="\\+\\d{1,3}([ -]*[0-9]+)+";
		
		Pattern phonePattern=Pattern.compile(phoneRegEx);
		Matcher matcher=phonePattern.matcher(text);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		System.out.println("+359 2 881-981".matches(phoneRegEx));
		System.out.println("invalid number".matches(phoneRegEx));
		System.out.println("+359 123-".matches(phoneRegEx));
		
	}

}
