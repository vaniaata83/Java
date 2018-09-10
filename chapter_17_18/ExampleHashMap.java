package chapter_17_18;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
	public static void main(String[] args){
	// да се преброй колко пъти се среща думата
		
String[] words={"yes", "hi", "hello","yes","yes", "helo"};

Map<String, Integer> wordsCount=new HashMap<String,   Integer>();
for(String word: words){
	Integer count=wordsCount.get(word);
	if(count==null){
		count=0;
		
	}
	wordsCount.put(word, count+1);
}
		System.out.println(wordsCount);
		
	}

}
