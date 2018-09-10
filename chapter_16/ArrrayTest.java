package chapter_16;

import java.util.Arrays;
import java.util.Scanner;

public class ArrrayTest {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		sc.nextLine();
//		String[] array=new String[n];
//		for(int i=0; i<array.length; i++){
//			array[i]=sc.nextLine();
//		}
//		Arrays.sort(array);
//		
//		for(int i=0; i<array.length;i++){
//			System.out.println(array[i]);
//		}
//		
		int[] nums={1,5,7,15,3};
		int[] nums2=nums.clone();
		int[] nums3=nums;
		
		nums[0]=33;
		System.out.println(nums[0]);
		System.out.println(nums3[0]);
		System.out.println(nums2[0]);
	}

}
