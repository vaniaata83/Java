package chapter_08;

import java.util.Arrays;

public class modifyArray {
	public static void modifyArr(int[] vani){
		vani[0]=7;
		System.out.print("Stoinostite na masiwa vani v metoda sa  : ");
		System.out.println(Arrays.toString(vani));
		
	}
	
	public static void main(String[] args){
		int []vani=new int[] {1, 2, 3};
		System.out.print("Predi modifyArr stoinostite na masiwa vani sa:");
		System.out.println(Arrays.toString(vani));
		
		modifyArr(vani);
		
		System.out.print("Sled izvikvane na metoda modyfyArr() stoinostite na masiwa vani sa:");
		System.out.println(Arrays.toString(vani));// Pri podavane na argumenti ot 
		//referenten tip se kopira samo stoinosta na promenlivata , koqto pazi refenciqta kym obeka v pametta, no ne i samiq obekt
	}

}
