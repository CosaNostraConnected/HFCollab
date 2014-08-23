package net.hackforums.morningstretches;

import java.util.InputMismatchException;
import java.util.Scanner;

class TemperatureConverter implements Runnable {

    private static void celsius(Scanner userInput) {
        System.out.print("Please enter the temperature in degrees celsius: ");
        double input = 0;
        try {
            input = userInput.nextDouble();
            System.out.println(input + " celsius is " + (input * 9 / 5 + 32) + "degrees fahrenheit.");
        } catch (InputMismatchException e) {
        }
    }

    private static void fahrenheit(Scanner userInput) {
        System.out.print("Please enter the temperature in fahrenheit: ");
        try {
            double input = userInput.nextDouble();
            System.out.println(input + " celsius is " + (input - 32 / 5 * 9) + "degrees fahrenheit.");
        } catch (InputMismatchException e) {
        }
    }

//    public static void main(String[] args) {
//        Scanner consoleScanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Would you like to do: [1] convert celsius to fahrenheit, [2] convert fahrenheit to celsius, or [3] quit: ");
//            int input = consoleScanner.nextInt();
//            if (input == 1) {
//                celsius(consoleScanner);
//            } else if (input == 2) {
//                fahrenheit(consoleScanner);
//            } else if (input == 3) {
//                System.exit(0);
//            }
//        }
//}

    @Override
    public void run() {
        Scanner consoleScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Would you like to do: [1] convert celsius to fahrenheit, [2] convert fahrenheit to celsius, or [3] quit: ");
            int input = 0;
            try {
                input = consoleScanner.nextInt();

                if (input == 1) {
                    celsius(consoleScanner);
                } else if (input == 2) {
                    fahrenheit(consoleScanner);
                } else if (input == 3) {
                    System.exit(0);
                }
            } catch (InputMismatchException e) {
            }
        }
    }
}
