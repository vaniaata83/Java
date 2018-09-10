package chapter_17_18;

import java.util.HashMap;
import java.util.Map;

//Мапове= дикшънъри = асоциативен масив
//Maps in Java keep unique <key, value>: Map po byrzo ot Set
//HashMap<key, value>
//TreeMap<key, value>
public class MapInJava {

	public static void main(String[] args) {
		Map<Integer, Double>numberAsDouble=new HashMap<>();
		numberAsDouble.put(1, 1.0);
		numberAsDouble.put(3, 3.14);
		
		System.out.println(numberAsDouble);
		
		for(Integer keyAsInt:numberAsDouble.keySet()){
			System.out.printf("Key[%d]=%.2f\n",keyAsInt,numberAsDouble.get(keyAsInt) );
		}
			
		String[]words={"yes", "hi", "hello", "hi", "welcome",
				"yes", "yes", "welcome", "hi","yes","hello","yes"};
		Map<String,Integer> wordsCount=new HashMap<>();
		for(String word:words){
			Integer count=wordsCount.get(word);
			if(count==null){
				count=0;
			}
//		wordsCount.put(word, count+1);		
		}
		System.out.println(wordsCount);

	}

}
