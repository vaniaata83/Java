package chapter_14;
/*Aнонимните класове са локални класове без име, които ползват за основа даден съществуващ
клас и му добавят допълнителни методи. В примера декларираме клас без име (анонимен клас), който наследява
класа java.lang.Object и добавя към него нов метод printSomething(). След
това създаваме инстанция на този анонимен клас и му извикваме добавения
метод printSomething().*/

public class AnnonymousClassExample {

	public static void main(String[] args) {
		new Object(){
			void printSomething(){
				System.out.println("I'm annonymous classs.");
			}
		}.printSomething();
		
	}

}
