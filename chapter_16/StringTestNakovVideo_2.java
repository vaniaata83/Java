package chapter_16;

public class StringTestNakovVideo_2 {

	public static void main(String[] args) {
		String fName="Steve";
		String lastName="Jobs";
		int age=56;
		System.out.println((fName+" "+lastName +" (age: "+age+ ")"));
		String allLangs="C#, Java;HTML, CSS; PHP,SQL";
		String[] langs=allLangs.split("[, ;]+");
		for(String lang:langs){
			System.out.println(lang);
		}
		System.out.println("Langs="+String.join(", ", langs));
		System.out.println("   \n\n Software University".trim());

	}

}
