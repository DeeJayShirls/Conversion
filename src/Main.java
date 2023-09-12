/* 
 * Name: Dejanae Shirley
 */

import java.util.Scanner;//import scanner class
public class Main {
	
	public static void main(String[] args) {
	 //Declarations
		double fahrenheit;
		double CONSTANT = 0.5556;
		double CelsiusTemp;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt to enter the Fahrenheit Temperature
		System.out.print("Enter Fahrenheit Temperature: ");
		fahrenheit = keyboard.nextDouble();
		System.out.printf("Fahrenheit Temperature: %.1f", fahrenheit);
		
		Conversion conversion = new Conversion(fahrenheit,CONSTANT);
		CelsiusTemp=conversion.calculateCelsius();
		
		System.out.println("\nThe Temperature in Celsius is: " + CelsiusTemp);
		
		System.out.println("Program By: Dejanae Shirley");
		keyboard.close();

	}
}
