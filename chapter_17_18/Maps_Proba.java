package chapter_17_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Maps_Proba {

	public static void main(String[] args) {
		TreeMap<String,Double> grades=new TreeMap<String,Double>();
//		grades.put("Washington", 4.0);
//		grades.put("Alabama", 5.0);
//		grades.put("Dakota", 3.50);
		
		grades.put("pesho", 4.0);
		grades.put("gosho", 5.0);
		grades.put("pesho", 2.0);
		grades.put("maria", 6.0);
		
		System.out.println(grades);
		
		TreeMap<String, ArrayList<Double>> grades1=new TreeMap<>();
		grades1.put("pesho", new ArrayList<>());
		grades1.get("pesho").add(2.70);
		grades1.get("pesho").add(6.0);
		
		grades1.put("maria", new ArrayList<>());
		grades1.get("maria").add(3.0);
		grades1.get("maria").add(5.0);
		
		Collections.sort(grades1.get("pesho"));
		//Collection.reserve(grades.get("yavor"));
		System.out.println(grades1);
		System.out.println(grades.keySet());
		System.out.println(grades1.values());
		System.out.println(grades1.entrySet());
		
//		for(String s: grades1.keySet()){
//			System.out.printf("Entry %s %s", s, grades1.get(s));
//		}
		
		for(Map.Entry entry: grades.entrySet()){
			System.out.println(entry.getKey());
		}
		
		
		

	}

}
