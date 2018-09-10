package chapter_05;

public class ExampleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String allLangs="C#, Java; HTML,CSS;PHP,SQL";
		String[] langs=allLangs.split("[, ;]+");
		
		for(String lang:langs){
			System.out.println(lang);
		}
		
		System.out.println("Langs="+String.join(",", langs));
		System.out.println(" \n\n Software University".trim());

	}

}
