package net.hackforums.morningstretches;

import java.util.Scanner;

class TemperatureConverter {
  
	private static void celsius() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature in celsius?");
		double input = scanner.nextDouble();
		System.out.println(input + " celsius is " + (input*9/5+32) + " fahrenheit" );
	}
	
	private static void fahrenheit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature in fahrenheit?");
		double input = scanner.nextDouble();
		System.out.println(input + " celsius is " + (input-32/5*9) + " fahrenheit" );
		System.out.println("Would you like to quit?(y/n)");
	}
	
	public static void main(String[] args) {
		Scanner consoleScanner = new Scanner(System.in);
		while(true) {
				System.out.print("Would you like to do: [1] convert celsius to fahrenheit, [2] convert fahrenheit to celsius, [3] quit: ");
				int userInput = consoleScanner.nextInt();
				if(userInput == 1) {
					celsius();
				} else if(userInput == 2) {
					fahrenheit();
				} else if(userInput == 3) {
					System.exit(0);
				}
			}
	}
}
