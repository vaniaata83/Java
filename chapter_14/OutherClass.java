package chapter_14;
/*В Java е възможно в един клас да се дефинира друг клас, т.е. класът да е
член на клас. Такъв клас наричаме вътрешен клас (inner class, nested
class)
В примера външният клас OuterClass дефинира в себе си като private член
класа InnerClass. Нестатичните методи на вътрешния клас имат достъп
както до собствената си инстанция this, така и до инстанцията на външния
клас (чрез синтаксиса OuterClass.this). При създаването на вътрешния
клас на конструктора му се подава this референцията на външния клас,
защото вътрешният клас не може да съществува без конкретна инстанция
на външния. Забележете, че външния клас може да вика свободно private
методи и конструктори от вътрешния клас.
Вътрешните класове могат да бъдат декларирани като статични (чрез
модификатора static). В този случай те могат да съществуват и без
външния клас, в който са разположени, но нямат достъп до неговата this
инстанция.*/


public class OutherClass {
	
	private String name;
	
	private OutherClass(String name){
		this.name=name;
	}
	
private class InnerClass{
	private String name;
	
	private InnerClass(String name){
		this.name=name;
	}
	
	private void printNames(){
		System.out.println("Inner name: "+this.name);
		System.out.println("Outher name: "+OutherClass.this.name);
	}
}

	public static void main(String[] args) {
		OutherClass outherClass=new OutherClass("outher");
		InnerClass innerClass=outherClass.new InnerClass("inner");
		innerClass.printNames();

	}

}
