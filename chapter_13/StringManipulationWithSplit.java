package chapter_13;

public class StringManipulationWithSplit {

	public static void main(String[] args) {
		String towns=" Plovdiv, Sofiq, Burgas,    Varna, Sozopol.  ";
		
		String [] nameOfTowns=towns.trim().split("[ ,.]+"); // "+" raboti taka:
		//Върни всички поднизове от променливата, които са разделени от
		//интервал, запетая или точка. Ако срещнеш два или повече съседни
		//разделителя, считай ги за един
		
		for(int i=0; i<nameOfTowns.length;i++){
			System.out.println("nameOfTowns["+i+"]:"+nameOfTowns[i]);
		} 
		System.out.println(nameOfTowns.length);
//		for(String name: nameOfTowns){
//			System.out.println(name);
//		}
		
	}

}
