package chapter_16;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(3);
//		arr.add(17);
//		arr.add(33);
//		arr.add(1);
//		arr.add(27);
//		
//		arr.remove(3);
//		arr.remove(new Integer(3));// pri Double nqma zna4enie, podavame remove(3.15) i go premahva.
//		System.out.println(arr);
		
		ArrayList<String>names=new ArrayList<String>();
		names.add("Vania");
		names.add("Nasko");
		names.add("Petia");
		names.add("Magi");
		names.add("Tania");
		System.out.println(names);
		
		names.add("Nakov");
		names.addAll(Arrays.asList("Pesho", "Gosho","Niki"));
		names.remove(3);
		names.add(3, "Minkov");
		
		System.out.println(names);
		names.set(3, "Peter");
		System.out.println(names);
		
		

			

	}

}
