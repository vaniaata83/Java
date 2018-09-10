package chapter_14;

public class Reactangle {
	private float width;
	private float height;
	
	public Reactangle(float width, float height){
		this.width=width;
		this.height=height;
	}
	public float getArea(){
		return this.height*this.width;
		
	}

	public static void main(String[] args) {
		Reactangle myArea=new Reactangle(2,3);
		System.out.println(myArea.getArea());
	}

}
