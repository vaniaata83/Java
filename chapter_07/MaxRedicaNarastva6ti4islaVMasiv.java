package chapter_07;
public class MaxRedicaNarastva6ti4islaVMasiv {
	static int []vani={-1,20,5,7,9,4,3,6,67,99,5,8,7,11,9,12};	
	//metod
	static void redica(int[] numbers){
		int count=1;
		int maxSequense=Integer.MIN_VALUE;
		int index=Integer.MIN_VALUE;
		for(int a=0;a<=numbers.length;a++){
			count=1;
			for(int b=a+1; b<numbers.length;b++){
				if(numbers[a]==numbers[b]-count){
					count++;
				}else{
					break;
				}
				if(maxSequense<=count){
					maxSequense=count;
					index=a;
				}	
			}
		}
		if(maxSequense==Integer.MIN_VALUE){
			System.out.println("Ne bqha namereni narastva6ti 4isla");
		}else{
			
		System.out.println(maxSequense);
		//cikyl za izvejdane na redicata na ekrana
		System.out.print("4islata sa:");
		for(int i=index;i<index+maxSequense;i++){
			System.out.print(numbers[i]+" ");		
		}
		}
	}
	public static void main(String[] args) {
		redica(vani);
	}
}
