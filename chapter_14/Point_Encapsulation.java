package chapter_14;

public class Point_Encapsulation {
//	//private double x;
//	//private double y;
//	
//	
//	public Point_Encapsulation(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//
//	public double getX() {
//		return x;
//	}
//
//	public void setX(double x) {
//		this.x = x;
//	}
//
//	public double getY() {
//		return y;
//	}
//
//	public void setY(double y) {
//		this.y = y;
//	}

	private double[] coordinates;
	public Point_Encapsulation(int x, int y){
		coordinates=new double[2];
		coordinates[0]=x;
		coordinates [1]=y;
		
	}
	
	public double getX(){
		return coordinates[0];
	}
	public void setX(double x){
		coordinates[0]=x;
	}
	public double getY(){
		return coordinates[1];
	}
	public void setY(double y){
		coordinates[1]=y;
	}
	
	
}
