package chapter_07;

import java.util.Arrays;

public class PrintMassiveFromEndToBegin {
	public static void main(String[]args){
		int[] vani= {1,2,3,4,5,6,7};
		int lenght=vani.length;
		int[]reserved=new int[lenght];
		
		for(int i=0; i<lenght; i++){
			reserved[lenght-i-1]=vani[i];
		}
		System.out.println(Arrays.toString(reserved));
	}

}
