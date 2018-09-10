package chapter_05;

public class ConditionalStatements_01 {
	public static void main(String[]args){
	
	System.out.println("char 'a'=='a'?" + ('a'=='a'));
	System.out.println("char 'a'=='b'?" +('a'=='b'));
	System.out.println("5!=6?" +(5!=6));
	System.out.println("5.0==5L?"+(5.0==5L));
	System.out.println("true==false?"+(true==false));
	System.out.println();
	
	float value=1.0f;
	float sum=0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
	System.out.println("Exact compare:"+(sum==value));
	System.out.println("Rounded compare:"+(Math.abs(sum-value)<0.000001));
	System.out.println();
	
	//Сравнение на стрингове (само с ==) дали сочат към един и същ обект
	String str="bira";
	String anotherStr=str;
	String bi="bi";
	String ra="ra";
	String thirdStr=bi+ra;
	
	System.out.println("str = "+str);
	System.out.println("anotherStr= "+anotherStr);
	System.out.println("thirdStr= "+thirdStr);
	System.out.println("str==anotherStr? "+(str==anotherStr));
	System.out.println("str==thirdStr? "+(str==thirdStr));
	
			
	
	

	
	}
}
