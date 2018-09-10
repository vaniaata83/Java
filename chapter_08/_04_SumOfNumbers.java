package chapter_08;

public class _04_SumOfNumbers {
	public static long calcNum(int...elements){
		long sum=0;
		for(int element:elements){
			sum=sum+element;
		}
		return sum;
		
	}
	public static void main(String[] args){
		long sum=calcNum(1,3);
		long sum2=calcNum(1,-5,-7);
		long sum3=calcNum();
		

		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}

}
