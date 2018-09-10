package chapter_11;

public class SystemTest {
	public static void main(String[] args){
		int sum=0;
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100000000;i++){
			sum++;
		}
		long endTime=System.currentTimeMillis();
		System.out.println(sum);
		System.out.println((endTime-startTime)/1000.0);
	}

}
