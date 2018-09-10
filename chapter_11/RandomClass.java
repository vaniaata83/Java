package chapter_11;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args){
		Random rand=new Random();
		for(int i=1;i<=6;i++){
			int a=rand.nextInt(49)+1;	
			System.out.printf("%d ",a);
	
		}
		
	}

}
