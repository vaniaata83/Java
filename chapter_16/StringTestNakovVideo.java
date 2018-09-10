package chapter_16;

public class StringTestNakovVideo {

	public static void main(String[] args) {
		String str="   Soft    Uni";
		System.out.println(str);
		for(int i=0;i<str.length();i++){
			System.out.printf("str[%d]=%s\n",i,str.charAt(i));
		}
		
		System.out.println(str.indexOf("Uni"));//4
		System.out.println(str.indexOf("uni"));//-1(not found)
		System.out.println(str.substring(4, 8));//do 7, no ne vklu4itelno
		System.out.println(str.replace("Soft", "Hard"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		
		String[] words=str.split("\\s+");
		for(int i=0; i<words.length;i++){
			System.out.printf("words[%d]=%s\n",i,words[i]);
		}
		
	}
	
	

}
