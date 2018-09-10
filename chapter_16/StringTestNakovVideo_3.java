package chapter_16;

public class StringTestNakovVideo_3 {

	public static void main(String[] args) {
	String []words="yes yes".split(" ");
	System.out.println("words[0]="+words[0]);
	System.out.println("words[1]="+words[1]);
	System.out.println(words[0]==words[1]);// ne raboti pri stringove
	System.out.println(words[1].equals(words[0]));
	System.out.println("Alice".compareTo("Bobi"));
	System.out.println("Alice".compareTo("Bobi"));
	System.out.println("Alice".compareTo("Alice"));
	
	
	}

}
