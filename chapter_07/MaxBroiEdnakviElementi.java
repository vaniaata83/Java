package chapter_07;

public class MaxBroiEdnakviElementi {
	public int []vani={2,2,1,1,1,2,3,4,2,1,99,99,1,5,5,5,1,1};
	public int [] nasko={1};
	
	public void broiEdnakvi(int[]numbers){
		int count=1;
		int maxSequense=1;
		int zahl=Integer.MIN_VALUE;
		if(numbers.length==0){
			System.out.println("Be6e podaden prazen masiv");
		}else if(numbers.length==1){
			System.out.println("Masivyt ima6e samo edin element i tova be6e 4isloto:"+numbers[0]);
			
		}else{	
		
		for(int a=0;a<numbers.length;a++){
			count=1;
			for(int b=a+1;b<numbers.length;b++){
				if(numbers[a]==numbers[b]){
					count++;
				}else{
					continue;
				}
				if(maxSequense<=count){
					maxSequense=count;
					zahl=numbers[a];
				}
				
				
			}
		}
		}
		System.out.println("4isloto "+zahl +"se sre6ta "+maxSequense+"pyti i tova be6e nai-4esto sre6tanoto 4islo");
		
	}
	
	
	public static void main(String[] args){
		 MaxBroiEdnakviElementi ref=new MaxBroiEdnakviElementi ();
		 ref.broiEdnakvi(ref.vani);
	}
	
	}


