package net.hackforums.morningstretches;

import java.util.Scanner;

class TemperatureConverter {
  
  private static void celcius() {
    Scanner scanner = new Scanner();
    System.out.println("What is the temperature in celcius?");
    double input = scanner.nextDouble();
    System.out.println(input + " celcius is " + (input*9/5+32) + " farenheight" );
  }
  
  private static void farenheight() {
    Scanner scanner = new Scanner();
    System.out.println("What is the temperature in farenheight?");
    double input = scanner.nextDouble();
    System.out.println(input + " celcius is " + (input-32/5*9) + " farenheight" );
  }
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner();
    
    while(true) {
        System.out.println("Would you like to convert: [1] celcius to farenheight, [2] farenheight to celcius");
        int input = scanner.nextInt();
        switch(input) {
          case 1:
            celcius();
            break;
          case 2:
            farenheight();
            break;
        }
        System.out.println("Would you like to quit?(y/n)");
        String banana = scanner.nextLine();
        if(banana.equalsIgnoreCase("y")) {
          break;
        } else {
          continue;
        }
    }
    
  }
  
}
