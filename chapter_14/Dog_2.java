package chapter_14;

public class Dog_2 {
	
	static int dogCount;
	private String name;
	private int age;
	
	
	public Dog_2(String name, int age){
		this.name=name;
		this.age=age;
		dogCount++;
	}
	
	public void bark(){
		System.out.println("wow-wow");
	}
	public void getInfo(){
		System.out.print("Dog's name: "+this.name+";age: "+this.age+"; often says:");
		this.bark();
	}

	public static void main(String[] args) {
		Dog_2 ref1=new Dog_2("Karaman",1);
		ref1.getInfo();
		Dog_2 ref2=new Dog_2("Bobi",2);
		Dog_2 ref3=new Dog_2("Sharo",3);
		
		
		System.out.println("Dog count is now: "+Dog_2.dogCount);

	}

}
