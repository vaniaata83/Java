package chapter_11;

import java.util.Random;

//Генериране на случайна парола,която е дълга между 8 и 15 символа съдържа поне две главни букви,
//поне две малки букви, поне една цифра и поне три специални знака.

public class RandomPasswordGenerator {
	//константите винаги с главни букви, и се декларират с модификаторите static i final
	
	private static final String GLAVNI_BUKVI="ABCDEFGHIJKLMNOPKRSTUVWXYZ";
	private static final String MALKI_BUKWI="abcdefghijklmnopqrstuvwxyz";
	private static final String CIFRA="0123456789";
	private static final String CHAR="~!@#$%^&*()_+=':;.,/?<>";
	private static final String ALL_CHARS=GLAVNI_BUKVI+ MALKI_BUKWI+CIFRA+CHAR;
	private static Random rnd=new Random();// definirame q tuk tazi promenliva "rnd"za da e dostypna ot vsi4ki stati4ni metodi v klasa
	
	public static void main(String[] args){
		StringBuilder password= new StringBuilder();
		//generirane na 2 glavni bukvi
		for(int i=1;i<=2;i++){
			char glavniBukvi=generateChar(GLAVNI_BUKVI);
			 VmykniNaSlu4ainPozicia(password, glavniBukvi);
		}
		////generirane na 2 malki bukvi
		for(int i=1;i<=2;i++){
			char malkiBukvi=generateChar(MALKI_BUKWI);
			 VmykniNaSlu4ainPozicia(password, malkiBukvi);
		}
		//generirane na edno 4islo
		char cifra=generateChar(CIFRA);
		 VmykniNaSlu4ainPozicia(password, cifra);
		 
		//generirane na 3 symvola
		for(int i=1; i<=3;i++){
			char ch=generateChar(CHAR);
			VmykniNaSlu4ainPozicia(password, ch);	
		}
		int count=rnd.nextInt(8);
		for(int i=1; i<=count;i++){
			char specialChr=generateChar(ALL_CHARS);
			 VmykniNaSlu4ainPozicia(password, specialChr);
			
		}
		System.out.println(password +" ");
		
	}
	//metod koito vry6ta slu4aino izbran simvol ot mnojestvoto, koeto mu e podadeno kato parametyr
	private static char generateChar(String symbol){
		int randomIndex=rnd.nextInt(symbol.length());
		char randomChar=symbol.charAt(randomIndex);
		return randomChar;
		
	}
	//tozi metod izbira slu4aina posiciq w StringBuilder obekta, koito mu e podaden i vmykva na tazi poziciq slu4aini 4isla
	private static void VmykniNaSlu4ainPozicia(StringBuilder password,char character ){
		int randomPosition=rnd.nextInt(password.length()+1);
		password.insert(randomPosition, character);
		
	}
	


}
