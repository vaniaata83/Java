package chapter_14;

import java.util.Scanner;

    //Class declaration
    class Dog {
    	
    	//Property-field definition
    	private String name;
    	
    	//Constructor definition
    	public Dog(){
    		this.name="Sharo";
    	}
    	//Constructor definition
    	public Dog(String name){
    		this.name=name;
    	}
    	
    	//Property getter-method definition:
    	public String getName() {
    		return name;
    	}
    	//Property setter-method definifion
    	public void setName(String name) {
    		this.name = name;
    	}
    	
    	//Metod definition
    	public void bark(){
    		System.out.printf("Dog %s said:Wow-wow!%n",name);
    	}
    	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Write first dog's name: ");
		String firstDogName=sc.nextLine();
		
		Dog firstDog=new Dog(firstDogName);
		System.out.print("Write second dog's name: ");
		Dog secondDog=new Dog();
		secondDog.setName(sc.nextLine());
	
		Dog thirdDog=new Dog();
		
		Dog[] dogs=new Dog[]{firstDog,secondDog,thirdDog};
		for(Dog dog:dogs){
			dog.bark();
		}
		
		
		
	}
	

}
