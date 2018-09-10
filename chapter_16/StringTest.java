package chapter_16;

import java.util.Arrays;

public class StringTest {
	public static void main(String[] args){
		String str="SoftUni";
		for(int i=0;i<str.length();i++){
			System.out.printf("str[%d]=%s\n", i,str.charAt(i));
		}
		
		System.out.println(str.indexOf("Uni"));
		System.out.println(str.indexOf("uni"));
		System.out.println(str.substring(4, 7));
		System.out.println(str.replace("Soft", "Hard"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String name="p1e2s3h4o";
		name=name.replaceAll("\\d", ""); 
		System.out.println(name);
		System.out.println(name.contains("pesho"));
		System.out.println(name.indexOf("pesho"));
		
		String ime1="Georgi";
		String ime2=new String("Georgi");
		System.out.println(ime1==ime2);
		System.out.println(ime1.equals(ime2));
		
		String s="pesho, !likes .lemons";
		String[] arr=s.split("[ \\.,!]+");
		System.out.println(Arrays.asList(arr));
		
	    String p="pesho";
	    String g="gosho";
	    System.out.println(p.compareTo(g));
	    System.out.println(g.compareTo(p)); // look ASCII table
		
	}

}
