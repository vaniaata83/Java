package chapter_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//програма, която брои колко пъти се среща дума в даден 
//текстов файл (за дума считаме всеки подниз от текста)

public class CountWordOccurences {

	public static void main(String[] args) {
		
String fileName="/Users/vanito83/Documents/workspace/BG_BOOK_TEST/src/chapter_15/sampleText";
Scanner fileReader=null;
int occurrences=0;
String word="Java";

try{
	fileReader=new Scanner(new File(fileName));
	System.out.println("File "+fileName+" opened");
	
	while(fileReader.hasNextLine()){
		String line=fileReader.nextLine();
		int index=line.indexOf(word);
		while(index!= -1){
			occurrences++;
			index=line.indexOf(word, (index+1));
			
		}
		
	}
}catch(FileNotFoundException fnf){
		System.out.println("File "+fileName+" not found");
	}catch(NullPointerException npe){
		System.out.println("File "+fileName+" not found");

	}finally{
		if(fileReader!=null){
			fileReader.close();
		}
		System.out.println("Scanner closed");
}

System.out.printf("The word %s occurs %d times", word, occurrences);

	}

}
