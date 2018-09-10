package chapter_14_1;

public class Dog {
	
	public String name="Sharo";
	
	public String getName(){
		return this.name;
	}
	
	public void bark(){
		System.out.println("wow-wow");
	}
	
	public void doSth(){
		this.bark();
		
	}
	
	public static void main(String[] args){
		Dog mydog=new Dog();
		System.out.println("My dog's name is: "+mydog.name);
		mydog.bark();
	}
	

}


