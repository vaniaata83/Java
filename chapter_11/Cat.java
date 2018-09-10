package chapter_11;

public class Cat {
	
	public String name;//ako sa private samo v tozi clas sa dostypni
	public String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Constructor po podrazbirane
	public Cat(){
		this.name="Unnamed";
		this.color="gray";
	}
	//Constructor s parametri
	public Cat(String name, String color){
		this.color=color;
		this.name=name;
	}
	
	public void sayMiau(){
		System.out.printf("My cat %s said: Miauuuu",name);
	}
	
	public static void main(String[] args){
		Cat myCat=new Cat();
		myCat.name="Alfred";
		System.out.printf(myCat.name);
	}
	
	
	

}
