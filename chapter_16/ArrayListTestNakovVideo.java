package chapter_16;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTestNakovVideo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new
				ArrayList<Integer>();
		numbers.add(5);
		System.out.println(numbers.get(0));
	
	
	ArrayList<String>names=new ArrayList<String>(){{
		add("Vania");
		add("Nasko");
		add("Pesho");
		add("Gosho");
		
	}};
	names.add("Nakov");//Vania,Nasko,Pesho,Gosho,Nakov
	names.remove(0);//Nasko,Pesho,Gosho,Nakov
	names.remove(1);//Nasko,Gosho,Nakov
	names.remove("Gosho");//Nasko,Nakov
	names.addAll(Arrays.asList("Alice","Tedy"));//Nasko,Nakov,Alice,Tedy
	names.add(3, "Silvia");//Nasko,Nakov,Alice,Silvia,Tedy
	names.set(2, "Mike");//Nasko,Nakov,Mike,Silvia,Tedy
	
	System.out.println(names);
	for(String name:names){
		System.out.println(name);
	}
	
ArrayList<Integer> nums=new ArrayList<Integer>(
		Arrays.asList(2,5,7,-1));
	nums.add(55);
	nums.remove(0);
	nums.addAll(Arrays.asList(2,3,4));//5,7,-1,55,2,3,4
	nums.add(4, 4);//5,7,-1,55,4,2,3,4
	nums.set(0, 1);//1,7,-1,55,4,2,3,4
	System.out.println(nums.get(0));

	System.out.println(nums);

	
	
	
	
	
	
	

}
}