package chapter_07;

public class RedicaRavniElementiVMasiv {
	//􏰇Напишете програма, която намира максималната редица от 
	//еднакви елементи в масив 􏰍пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} 􏰗 {2, 2, 2}
	public int[] vani={1000,1,1,2,2,3,3,3,22,22,22,22,22,22,22,4,4,4,4,55};


	
	public void maxEdnakvi(int[]numbers){
		int count=1;
		int MaxSequense=0;
		int index=0;
		for(int a=0;a<numbers.length-1;a++){
			count=1;
			int b=a+1;
			
			while(numbers[a]==numbers[b]){
				b++;
				count++;
				//if(b==numbers.length){
					//break;
				//}
			}
			if(MaxSequense<=count){
				MaxSequense=count;
				index=a;
			}
		}
		System.out.println(MaxSequense);
		System.out.println(index);
		System.out.println();
		for(int i=index;i<=(index+MaxSequense)-1;i++){
			System.out.print(vani[index]+" ");
		}
		
		
		
		
	}
	
     public static void main(String[] args) {
    	 RedicaRavniElementiVMasiv ref=new  RedicaRavniElementiVMasiv();	
    	 ref.maxEdnakvi(ref.vani);
    	 
	}

}
