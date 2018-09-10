package chapter_14;

public class MyMathClass {
	
	public static final double PI=3.141592653589793;
	
	//P=2.PI.r;
	public static double getCirclePerimeter(double r){
		return(2*PI*r);
	}
	
	public static int add(int a, int b){
		return(a+b);
		
	}

	public static void main(String[] args) {
		double radius=5;
		double circlePerimeter=getCirclePerimeter(radius);
		System.out.println("Circle with radius "+radius+" has perimetyr: "+circlePerimeter);
		System.out.println(getCirclePerimeter(3));
		
		System.out.println(MyMathClass.add(7, 3));

	}

}
