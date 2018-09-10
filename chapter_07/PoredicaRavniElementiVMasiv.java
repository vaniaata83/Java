package chapter_07;

public class PoredicaRavniElementiVMasiv {	
	public int []vani={2,2,1,1,1,1,2,3,4,2,1,99,99,1,5,5,5,1,1,1,1,1,1};
	public int [] nasko={1};
	
	public void poredicaEdnakvi(int[]numbers){
		int count=1;
		int maxSequense=Integer.MIN_VALUE;
		int index=Integer.MIN_VALUE;
		
		for(int a=0;a<numbers.length;a++){
			count=1;
			for(int b=a+1;b<numbers.length;b++){
				if(numbers[a]==numbers[b]){
					count++;
				}else{
					break;
				}
				if(count>=maxSequense){
					maxSequense=count;
					index=a;				
				}			
			}
		}
		for(int i=index;i<index+maxSequense;i++){
			System.out.print(numbers[i]);
			System.out.println();
		}
		System.out.println(index+" "+maxSequense);		
	}
	public static void main(String[] args){
		PoredicaRavniElementiVMasiv ref=new PoredicaRavniElementiVMasiv();
		ref.poredicaEdnakvi(ref.vani);		
	}
}
