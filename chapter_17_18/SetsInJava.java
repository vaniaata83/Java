package chapter_17_18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Set- структура от данни, която позволява като се въвеждат елементи,
// те да се пазят като отделни обекти и не записва повторения за ралика от List
// Много е удобно за тип данни, който не използва повторения
//HashSet<>използва хеш таблица и елементите не са подредени, например по реда
//на тяхното въвеждане или др. начин 
//
//TreeSet<> също като хеш сет, но подрежда данните по 
//азбучен или нарастващ ред, отново без повторения (red black set)
public class SetsInJava {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Peter");
		set.add("Tosho");
		set.add("Peter");
		set.add("George");
		set.add("Maria");
		set.add("Alice");
		//set.remove("Peter");
	System.out.println(set);
	System.out.println(set.contains("Maria"));
	System.out.println();
	
	for(String element:set){
		System.out.println(element);
	}
	System.out.println();
	
	
	TreeSet<String> orderedSet=new TreeSet(set);
//	for(String name:set){
//		orderedSet.add(name);
//	}
	for(String name:orderedSet.descendingSet()){
		System.out.println(name);
	}

	}
	

}
