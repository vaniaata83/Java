package chapter_03;

public class Operators_3 {
	public static void main(String[]argument){//args , argument ili argv
		
		short a =3;//              0000 0011
		short b =5;//              0000 0101
		
		System.out.println(a|b);// 0000 0111
		System.out.println(a&b);// 0000 0001
		System.out.println(a^b);// 0000 0110
		System.out.println(~a&b);//0000 0100
		System.out.println(a<<1);//0000 0110
		System.out.println(a<<2);//0000 1100
		System.out.println(a>>1);//0000 0001
		
		//Operatori za stravnenie
		
		int x=10,  y=5;
		System.out.println("x > y:" + (x>y)); //true
		System.out.println("x < y:"+(x<y)); //false
		System.out.println("x >= y:" + (x>=y));//true
		System.out.println("x <= y:" + (x<=y));//false
		System.out.println("x == y:" + (x==y));//false
		System.out.println("x != y:" + (x!=y));//true
		
		int m,n,z;
		m=n=z=25;// kaskadno prisvoqvane
		
		int v =2;
		int p =4;
		 v*=p;
		 System.out.println(v); //Kombiniran operator za prisvoqvane (*=; /=; %=; +=; -=;)
		 System.out.println();
		 
		 
		 int f =6;
		 int h= 4;
		 System.out.println(h*=2);      //8
		 int w=h=3;                     // w=3 i h=3
		 System.out.println(w);        //w=3
		 System.out.println(f|=1);     //7
		 System.out.println(f+=3);     //10
		 System.out.println(f/=2);     //5
		 
		 
		
	
	}

}
