package chapter_14;
/*Достъпването на нестатичните елементи 
 * на класа (полета и методи), се осъществява чрез ключовата дума this и оператора за достъп – точка.*/
 
public class Dog_1 {
	
	String name;
	int age=2;
	int lenght;
	boolean isMale;
	//Достъп до нестатичните полетата на класа от нестатичен метод
	int getAge(){
		return this.age;
	}
	
	void getOlder(){
		this.age++;
	}

	public static void main(String[] args) {
		Dog_1 dog=new Dog_1();
		//po default
		System.out.println("Dog's name is:"+dog.name);
		System.out.println("Dog's age is:"+dog.age);
		System.out.println("Dog's lenghtis:"+dog.lenght);
		System.out.println("Dog's is male:"+dog.isMale);
		
		System.out.println("Dog's age is:"+dog.getAge());
		dog.getOlder();
		System.out.println("After one year dog's age is:"+dog.getAge());
		
		System.out.println();
		//За разлика от полетата, локалните променливи, не биват инициализирани с
		//подразбираща се стойност след тяхното деклариране
		int notInicializedLocalVariable;
		//System.out.println(notInicializedLocalVariable);Кодът няма да може да се компилира и
		//съобщението за грешка ще бъде подобно на следното:The local variable notInitializedLocalVariable
		//may not have been initialized.

	}

}
