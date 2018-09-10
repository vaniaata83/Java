package chapter_07;

public class RedicaNarastva6tiSDve {
	public static int[] vani={1,2,3,4,6,8,10,12,55,57,59};
	public static int[] nasko={};
	
	//metod
	public static void redicaPrez2(int[] numbers){
		int count=1;
		int maxSequense=Integer.MIN_VALUE;
		int index=Integer.MIN_VALUE;
		int k=1;
		
		for(int a=0; a<numbers.length;a++){
			count=1;
			for(int b=a+1; b<numbers.length;b++){
				if(numbers[a]==numbers[b]-(count*2)){
					count++;
					
				}else{
					break;
				}
				if(count>=maxSequense){
					maxSequense=count;
					index=a;
				}
			}
			
		}if(maxSequense==Integer.MIN_VALUE){
		
			System.out.println("Ne bqha namereni prez 2 narastwa6ti 4isla");
			
		}else{
			System.out.print("Max.redica narastwa6ti prez dve 4isla: ");
			for(int i=index; i<index+maxSequense; i++){
				System.out.print(numbers[i]+" ");
			}
			System.out.println();
			
		}
		
	}
	


	public static void main(String[] args) {
		redicaPrez2(vani);
		redicaPrez2(nasko);

	}

}
