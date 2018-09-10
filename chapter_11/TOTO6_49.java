package chapter_11;

import java.util.Random;

//GENERIRANE NA 6 SLU4AINI 4ISLA V INTERVALA OT 1 D0 49 (IZPOLZVAME CLASSA RANDOM)
public class TOTO6_49 {
	public static void main(String[] args){
		Random rand=new Random();
		for(int i=1; i<=6; i++){
			int RandomNummber=rand.nextInt(49)+1;//zastoto moje da vyrne 0 i taka izbqgvame 0 
			System.out.print(RandomNummber+" ");
		}
	}

}
