package chapter_07;
public class Nararastva6taRedicaVMasiv {
	public int[] vani={0,1,2,3,4,5,22,45,7,8,9};
	
	public void poredicaEdnakvi(int...numbers){
		int count=1;
		int maxSequense=Integer.MIN_VALUE;
		int index=Integer.MIN_VALUE;
		
		for(int a=0;a<numbers.length;a++){
			count=1;
			for(int b=a+1;b<numbers.length;b++){
				if(numbers[a]==numbers[b]-count){
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
			System.out.println(numbers[i]);
			System.out.println();
		}	
		System.out.println(index+" "+maxSequense);	
	}
	public static void main(String[] args){
		Nararastva6taRedicaVMasiv ref=new Nararastva6taRedicaVMasiv();
		ref.poredicaEdnakvi(ref.vani);		
	}
}
