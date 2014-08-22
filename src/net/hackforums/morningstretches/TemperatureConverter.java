package net.hackforums.morningstretches;

import java.util.Scanner;

class TemperatureConverter {
  
	private static void celcius() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature in celcius?");
		double input = scanner.nextDouble();
		System.out.println(input + " celcius is " + (input*9/5+32) + " farenheight" );
	}
	
	private static void farenheight() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature in farenheight?");
		double input = scanner.nextDouble();
		System.out.println(input + " celcius is " + (input-32/5*9) + " farenheight" );
		System.out.println("Would you like to quit?(y/n)");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
				System.out.println("Would you like to do: [1] convert celcius to farenheight, [2] convert farenheight to celcius, [3] quit");
				int input = scanner.nextInt();
				if(input == 1) {
					celcius();
				} else if(input == 2) {
					farenheight();
				} else if(input == 3) {
					System.exit(0);
				}
			}
	}
}
