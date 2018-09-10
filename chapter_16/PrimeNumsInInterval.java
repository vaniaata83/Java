package chapter_16;

import java.util.ArrayList;

//намиране на простите числа в някакъв интервал
// ако едно число не е просто, то съществува поне
//един делител в интервала [2 …корен квадратен от даденото число]
public class PrimeNumsInInterval {
	
	public static ArrayList<Integer> primeNums(int start, int end){
		ArrayList<Integer> primeList=new ArrayList<>();
		for(int i=start; i<=end; i++){
			boolean isPrime=true;
			for(int j=2; j<Math.sqrt(i); j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}if(isPrime){
				primeList.add(i);
			}
		}
		
		return primeList;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> nums=primeNums(5, 10);
		//System.out.println(nums);
		for(int p:nums){
			System.out.println(p);
		}

	}

}
