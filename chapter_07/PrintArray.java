package chapter_07;

public class PrintArray {
	public static void main(String[]args){
		String [] array={"one","two","three","four"};
		System.out.println(array);//отпечатва адреса на масива в динам.памет, защото масива е референция към обект
		
		for(int i=0; i<array.length; i++){
			System.out.printf("element[%d]=%S%n", i, array[i]);
			
		}
		

	System.out.println(java.util.Arrays.toString(array));
	
		
	
	}
	

}
