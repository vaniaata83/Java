package chapter_13;

import java.util.Date;

public class StringManipulationWithStringBuilder_03 {

	public static void main(String[] args) {
		System.out.println(new Date());
		StringBuilder sb=new StringBuilder();
		sb.append("Numbers: ");
		for(int idx=1; idx<=5000; idx++){
			sb.append(idx);
		}
		System.out.println(sb.substring(0, 1024));
		System.out.println(new Date());
		
		//Обръщане на низ на обратно – пример
		
		

	}

}
