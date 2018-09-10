package chapter_14;
/*Локален клас- клас дефиниран в метод. Подобни са като вътрешните класове, но не могат да бъдат статични
Те имат достъп до член-променливите и методите на външния им клас. Локалните класове 
могат да осъществяват достъп и до променливите, декларирани в метода, в
който се съдържат, стига тези променливи да са обявени като final
Локалните класове са достъпни само и единствено в метода, в който са
декларирани и нямат модификатори за видимост и не могат да бъдат
статични, както всяка една локална променлива.*/

public class LocalClassExample {
	

	public static void main(String[] args) {
		final int value=5;
		class LocalClass{
			void printSomething(){
				System.out.println(value);
			}
		}
		LocalClass localClass=new LocalClass();
		localClass.printSomething();
		

	}

}
