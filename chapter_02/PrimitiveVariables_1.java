package chapter_02;

public class PrimitiveVariables_1 {
	public static void main(String[]args){
		//byte,short,int,long
	byte centures = 20;
	short years =200;
	int days=730480;
	long hours =17531520;
	 
	System.out.println(centures +" "+"века са:"+" " + years +"години,"+ " "+days + "дни,"+" "+hours+ "часове.");
	System.out.println();
	
	//float, double
	float floatPi=3.141592653589793238f;
	double doublePi=3.141592653589793238;
	System.out.println(floatPi);
	System.out.println(doublePi);
	System.out.println();
	//float attention
	float sum=0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
	float num=1.0f;
	boolean equal=(sum==num);
	System.out.println(equal);
	System.out.println(sum);
	System.out.println();
	
	//boolean
	int a = 5;
	int b = 7;
	boolean greaterAB=(a>b);
	boolean equall=(a==b);
		if(greaterAB){
			System.out.println("A>B");
		}
		else{
			System.out.println("A<B");
		}
	System.out.println(equall);
	System.out.println();
	
	//char
	char symbol='A';
	
	System.out.println("The code of '"+symbol+"'is:"+(int)symbol);
	System.out.println();
	
	//Escaping posledovatelnosti
	char symbola='a';
	System.out.print(symbola);
	symbola='\u003A';
	System.out.println(symbola);
	
	symbola='\'';
	System.out.println(symbola);
	
	symbola='\\';
	System.out.println(symbola);
	
	//literali
	
	String quotation="\"Hello, Jude\", he said";
	System.out.println(quotation);
	
	String path= "C:\\Windows\\Notepad.exe";
	System.out.println(path);

	

	
	
	
	}

}
