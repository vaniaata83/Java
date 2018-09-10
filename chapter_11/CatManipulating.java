package chapter_11;

public class CatManipulating {
	public static void main(String[] args){
		Cat myCat=new Cat();
		myCat.name="Alfred";
		System.out.println(myCat.name);
		
		myCat.sayMiau();
		System.out.println();
		
		Cat someCat=new Cat();
		someCat.sayMiau();
		System.out.println();
		System.out.println(someCat.name + " "+someCat.color);
		
		Cat myBrownCat=new Cat("Joni","brown");
		myBrownCat.sayMiau();
		System.out.println();
		System.out.printf("The color of cat %s is %s.%n",myBrownCat.name,myBrownCat.color);
	
	}

}
