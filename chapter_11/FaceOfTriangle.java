package chapter_11;

import java.util.Scanner;

public class FaceOfTriangle {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Vavedete dyljinata na stranata: ");
		int a=sc.nextInt();
		System.out.println("Vavedete dyljinata na drugata stranata: ");
		int b=sc.nextInt();
		System.out.println("Vavedete ygyla mejdu dvete strani: ");
		int angle=sc.nextInt();
		System.out.println(0.5*a*b*Math.sin(Math.toRadians(angle)));
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
