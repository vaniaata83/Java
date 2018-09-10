package chapter_11;

public class Redica {
	private static int currentValue=-1;
	private Redica(){
		
	}
		public static int nextValue(){
			currentValue++;
			return currentValue;
		
	}
		
		public static void main(String[] args){
		System.out.printf("%d,%d,%d",Redica.nextValue(),Redica.nextValue(),Redica.nextValue());
		}

}
