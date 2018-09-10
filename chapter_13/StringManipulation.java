package chapter_13;

public class StringManipulation {

	public static void main(String[] args) {
		// долепване на низове (контатенация) 1-ви начин
		String greet="Hello, ";
		String name="Vania!";
		String result=greet.concat(name);
		System.out.println(result);
		
		// долепване на низове (контатенация) 2-ри начин
		String greet1="Hello, ";
		String name1="Vania!";
		String result1=greet1+name1;
		result1+="How are you?";
		System.out.println(result1);
		
		String msg="The number of the beast is: ";
		int beastNum=111;
		String result2=msg+beastNum;
		System.out.println(result2);
		
		//Търсене на низ в друг низ (броенето започва от 0!!!)
		
		String book="Introduction to Java book";
		int index=book.indexOf("Java"); //16
		System.out.println(index);
		 
		//Всички срещания на дадена дума
		String quote="The main subject in the \"Intro Java\"" + 
		" book is Java for Java newbies.";
		int index1=quote.indexOf("Java");
		while(index1!=-1){
			System.out.println("Java found on index:"+index1);
			index1=quote.indexOf("Java", index1+1); //analogi4no ako polzvame lastindexof(), pri koito namalqme s 1-ca	
		}
		
		//извличане на част от низ
		String path = "C:\\Pics\\Rila2008.jpg";
		String fileName=path.substring(8, 16);// ot 1-va poziciq do 2-ra no -1 (t.e do 15 v slu4aq)
		System.out.println(fileName);
		
		/*Как бихме могли да изведем името на файла и неговото разширение? Тъй като знаем как се записва път във файловата 
		  система, можем да процедираме по следния план:
				- търсим последната обратна наклонена черта в текста;
				- записваме позицията на последната наклонена черта;
				- извличаме подниза от получената позиция + 1.*/
		
		String path1 = "C:\\Pics\\Rila2008.jpg";
		int index2= path.lastIndexOf("\\"); // index=7
		String fullName= path1.substring(index2 + 1);
		System.out.println(fullName);
		
		//Разцепване на низ по разделител: (split(...))
		 
		String listOfBeers="Amstel, Zagorka, Tuborg, Becks.";
		String [] beerArr=listOfBeers.split("[ ,.]+");
		for(String beer : beerArr){
			//if(!beer.equals("")){
			System.out.println(beer);
		//}
		}
		
		String small="[a-z]";
		System.out.println(small);
		
		String allLetters="[a-zA-Zа-яА-Я]";
		
		/*В сила са и операндите OR, AND и NOT за работа с множества. Можем,
		например, да разделим даден текст по всички символи, които не са цифри:*/
		
		String nan = "[^0-9]";
		/*Възможно е изграждането на сложни регулярни изрази, изградени от много
		обединения и сечения на множества. Те могат да бъдат използвани за
		задаване на набор от разделители при използването на split(…), за търсене
		на подниз, съвпадащ с определен шаблон, или за заместване на един низ с
		друг по определени критерии.*/
		
		
		


	}

}
