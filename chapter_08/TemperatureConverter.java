package chapter_08;

import java.util.Scanner;

public class TemperatureConverter {
	public static double convertFahrenheitToCelsius(double temperatureF){
		double temperatureC=(temperatureF - 32)*5/9;
		return temperatureC;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter Temperature in Fahrenheit: ");
		double temperature=sc.nextDouble();
		
		
		temperature=convertFahrenheitToCelsius(temperature);
		
		System.out.printf("Your body temperature in Celsius degree is %f.%n", temperature);
		
		if(temperature>=37){
			System.out.println("You are ill!");
		}
		sc.close();
	}
	

}
