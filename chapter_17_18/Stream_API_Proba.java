package chapter_17_18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream_API_Proba {

	public static void main(String[] args) {
//		List<String> names=new LinkedList<>();
//		names.add("pesho");
//		names.add("pesho");
//		names.add("pesho");
//		names.add("pesho");
//		
//		System.out.println(names);
//		//names.stream().distinct().forEach(System.out::println);
//		//distinct- filtrira povtoreniqta, vryshta stream
//		List<String>processedList=names.stream().distinct().collect(Collectors.toList());//vryshta List
//		System.out.println(processedList);
		
		
		
		List<Integer> nums=new LinkedList<>();
		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(4);
		nums.add(2);
		
		
//		Predicate<Integer>isOdd=new Predicate<Integer>(){
//
//			@Override
//			public boolean test(Integer t) {
//				return t % 2 ==1;
//			}
//			
//		};
//		nums.stream().filter(isOdd).forEach(System.out::println);
//		
		//drug na4in bez Predicate:
		nums.stream().filter(i->i%2==1).forEach(System.out::println);
		System.out.println();
		nums.stream().sorted().forEach(System.out::println);
		System.out.println();
		// ne mi e qsno!!!!
		
		Collections.sort(nums);
		for (Integer num : nums){
			System.out.println(num);
		}
		
//		nums.stream().sorted((i,k)->i-k).forEach(System.out::println);
		}
		
		//q pusni sq da vidim sa6oto li e?daaaa razbra li kvo pravim? da s for cicy pyrvo gi sortirash i posle printda
	
	}


