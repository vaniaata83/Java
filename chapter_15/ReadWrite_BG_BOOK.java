package chapter_15;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintStream;
import java.util.Scanner;

public class ReadWrite_BG_BOOK {

	public static void main(String[] args)  {
		
		File file=new File("/Users/vanito83/Documents/workspace/BG_BOOK_TEST/src/chapter_15/proba.txt");
		
		try {
//			PrintStream fileWriter=new PrintStream("/Users/vanito83/Documents/workspace/BG_BOOK_TEST/src/chapter_15/proba.txt");
//		    for(int i=1; i<=20; i++){
//		    	fileWriter.println();
//		    }
//		    fileWriter.close();
			Scanner readFile=new Scanner(file, "UTF-8");
			
			int lineNumber=0;
			while(readFile.hasNextLine()){
				lineNumber++;
				System.out.printf("Line: %d:%s%n", lineNumber,readFile.nextLine());
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
