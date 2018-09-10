package chapter_17_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SudentsAndTheirGrades {
	public static void main(String[] args){
		HashMap <String, ArrayList<Integer>> grades = new HashMap<>();
		grades.put("Ani", new ArrayList<>(Arrays.asList(5)));
		grades.put("Pesho", new ArrayList<>(Arrays.asList(3,4,5)));
		grades.get("Ani").add(6);
		System.out.println(grades);
		
	}

}
