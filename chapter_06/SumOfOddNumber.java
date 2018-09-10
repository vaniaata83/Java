package chapter_06;

import java.util.Scanner;

public class SumOfOddNumber {
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter number n = ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i+=2){
			if(i%7==0){
				continue; /* Този оператор спира итерацията на най-вътрешния цикъл, но не излиза от него.
				Ще намерим сумата на всички нечетни естествени числа в интервала [1...n], който не се делят на 7.
				Ще използваме for-цикъл. При инициализиране на променливата ще и зададем стойност 1, тъй като това е първото 
				нечетно естествено число в интервала [1...n]. Ще проверяваме дали i е все още в интервала (i <= n). 
				В израза за обновяване на променливата ще я увеличаваме с 2, за да работим само с нечетни числа.
				В тялото на цикъла ще правим проверка дали числото се дели на 7. Ако това е изпълнено извикваме 
				оператора continue, който ще прекрати изпълнението на цикъла (няма да добави текущото число към сумата). 
				Ще се извърши обновяване на променливата и ще продължи изпълнението на цикъла. Ако не е изпълнено ще премине
				към обновяване на сумата с числото.*/
			}
			sum=sum+i;
			
		}
		
		System.out.println("Sum="+sum);
		
	}

}