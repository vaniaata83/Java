package chapter_06;

public class ForeachLoop {
	public static void main(String[]args){
		/*for (variable : collection){
			statements;
	    } Разширена конструкция  for-цикъл*/
		
		int[] numbers = {1,2,3,4,5,6,7};
		for(int i: numbers){
			System.out.printf("%d",i);
		}
		
		System.out.println();
		
	    String[] towns={"Plovdiv","Burgas","Sofia","Nesseber","Varna"};
	    for (String town : towns){
	    	System.out.printf("%s",town);
	    	
	    }
	     
	    
	}
	

}
