package chapter_06;
/*всички възможни комбинации от тотото (6/49).
Трябва да намерим и отпечатаме всички възможни извадки от 6 различни числа в интервала [1...49]*/
public class toto6Ot49 {
	public static void main(String[]args){
		int counter=0;
		for(int i1=1; i1<=44; i1++){
			for(int i2=i1+1; i2<=45; i2++){
				for(int i3=i2+1; i3<=46; i3++){
					for(int i4=i3+1; i4<=47; i4++){
						for(int i5=i4+1; i5<=48; i5++){
							for(int i6=i5+1; i6<=49; i6++){
								//System.out.printf("%d %d %d %d %d %d %n",i1,i2,i3,i4,i5,i6);
								counter++;
								
							}
							
								
							}
							
						
						}
					}
				}
				
			}
		System.out.print(counter);
		}
		

	
	}
	


