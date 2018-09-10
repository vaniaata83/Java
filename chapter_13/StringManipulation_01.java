package chapter_13;

public class StringManipulation_01 {
	/*Регулярни изрази – полезни конструкции
	Съществуват предефинирани класове, които обобщават често използвани
	множества. Някои от тях са:
	- . (символът точка) – обхваща всички възможни символи (може да
	прихваща или не обозначенията за нов ред)
	- \d – обхваща всички цифри (еквивалентно на [0-9])
	- \D – обхваща всички символи, които не са цифри (еквивалентно на
	[^0-9])
	- \s – знак за интервали: [ \t\n\x0B\f\r]
	- \S – всички знаци, освен тези за интервали: [^\s]
	- \w – всички символи, считани за дума: [a-zA-Z_0-9]
	- \W – еквивалентно на [^\w]*/
	
	public static void main(String[] args) {
		String catalog =
				"MicrowaveOven: 170, \n" +
				"AudioSystem: 125, \n" +
				"TV: 315, \n" +
				"Refrigerator: 400";
		System.out.println(catalog);
		
		System.out.println();
		
		String[] products=catalog.split("[\\d\\s,:]+");
		for(String product : products){
			System.out.println(product+" ");
		}
		
		String[] prices=catalog.split("[\\D]+");
		for(String price: prices){
			System.out.print(price+" ");
		}
		

	}

}
