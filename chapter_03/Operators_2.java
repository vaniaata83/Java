package chapter_03;

public class Operators_2 {
	public static void main(String[]args){
		boolean a=true;
		boolean b=false;
		System.out.println(a&&b);//false
		System.out.println(a||b);//true
		System.out.println(!b);//true
		System.out.println(b||true);//true
		System.out.println((5>7)^(a==b));//false
	}

}
