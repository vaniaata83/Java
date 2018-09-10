package chapter_17_18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets_Proba {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums=new LinkedHashSet<Integer>(); // v reda v koito sa podadeni
		nums.add(23);
		nums.add(73);
		nums.add(53);
		nums.add(31);
		nums.add(57);
		
		System.out.println(nums);
		
		HashSet<Integer> hashset =new HashSet<Integer>();// razbyrkano, po-byrz dostyp
		hashset.add(31);
		hashset.add(57);
		hashset.add(23);
		hashset.add(75);
		hashset.add(101);
		
		System.out.println(hashset);
		
		TreeSet<Integer> treeset=new TreeSet<Integer>(); //podredeni po vyzhodqsht / (red black set)
		treeset.add(31);
		treeset.add(57);
		treeset.add(23);
		treeset.add(75);
		treeset.add(101);
		
		System.out.println(treeset);
		
		
	}

}
