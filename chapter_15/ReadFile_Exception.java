package chapter_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile_Exception {

	public static void main(String[] args) {
		String fileName="/Users/vanito83/Documents/workspace/BG_BOOK_TEST/src/chapter_15/proba2.txt";
		Scanner fileRead=null;
		int lineNum=0;
		try{
			fileRead=new Scanner(new File(fileName));
			System.out.println("File "+fileName+"  opened.");
			while(fileRead.hasNextLine()){
				lineNum++;
				System.out.printf("Line %d:%s%n", lineNum,fileRead.nextLine());
			}
			
		}catch(FileNotFoundException fnf){
			System.out.println("File "+fileName+" not found");
		}catch(NullPointerException npe){
			System.out.println("File "+fileName+" not found");

		}finally{
			if(fileRead!=null){
				fileRead.close();
			}
		}
		
	}

}
