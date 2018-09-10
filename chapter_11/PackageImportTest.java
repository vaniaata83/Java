package chapter_11;

import java.util.*;

public class PackageImportTest {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> vani=new ArrayList <Integer>();
		ArrayList<Double> nasko=new ArrayList<Double>();
		
		while(true){
			System.out.print("Enter an int or double: ");
			if(sc.hasNextInt()){
				vani.add(sc.nextInt());
			}else if(sc.hasNextDouble()){
				nasko.add(sc.nextDouble());
			}else{
				break;
			}
				
			
		}
		System.out.printf("Vie vavedohte tezi celi 4isla: %s%n",vani.toString());
		System.out.printf("Vie vavedohte tezi drobni 4isla: %s%n ",nasko.toString());
		
		
	}

}
