package chapter_15;

import java.io.FileWriter;
import java.io.PrintWriter;


import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class ReadWrite  {	

	public static void main(String[] args){
		
		try {
			writeToFile("/Users/vanito83/Documents/workspace/BG_BOOK_TEST/src/chapter_15/sample.txt", "NOVO", true);
			
			String[] result=readFile("/Users/vanito83/Documents/workspace/BG_BOOK_TEST/src/chapter_15/sample.txt");
			for(String line:result){
				System.out.println(line);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
}
	//metod za 4etene na fail
	public static String[]  readFile(String path) throws IOException {
		//String path="//Users//vanito83//Desktop//test.txt";
		FileReader fr=new FileReader(path);
		BufferedReader textReader=new BufferedReader(fr);
		
		//int numberOfLines=3;//readLines();
		int numberOfLines=readLines(path);
		String[] textData=new String[numberOfLines];
		int i;
		for(i=0; i<numberOfLines;i++){
			textData[i]=textReader.readLine();
		}
		textReader.close();
		return textData;
	}
	
	//metod za opredelqne na kolko reda ima daden fail za da 4etem celiq fail a ne samo 3 reda
	
	public static int readLines(String path) throws IOException{
		FileReader fr=new FileReader(path);
		BufferedReader textReader=new BufferedReader(fr);
		
		String aLine;
		int numberOfLines=0;
		
		while((aLine=textReader.readLine())!=null){
			numberOfLines++;
		}
		textReader.close();
		return numberOfLines;
	}
	 
	//metod za pisane vyv fail
	public static void writeToFile(String path, String line, Boolean appendToFile) throws IOException{
		FileWriter write=new FileWriter(path, appendToFile);
		PrintWriter printLine=new PrintWriter(write);
		
		printLine.printf("%s"+"%n", line);
		printLine.close();
	}
	
}