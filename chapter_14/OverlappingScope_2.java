package chapter_14;

public class OverlappingScope_2 {
	int myValue=3;
	
	void printMyValue(){
		System.out.println("My value is: "+myValue);
	}
	
	
	int calculateNewValue(int newValue){
		int result=myValue+newValue;
		return result;
	}
	
	void printMyValue1(){
		int myValue=5;
		
		System.out.println("My value is: "+myValue);
	}

	public static void main(String[] args) {
		OverlappingScope_2 instance=new OverlappingScope_2();
		instance.printMyValue();
		
		System.out.println("calculateNewValue is: "+ instance.calculateNewValue(4));
		instance.printMyValue1();

	}

}
