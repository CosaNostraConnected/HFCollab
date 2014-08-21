package net.hackforums.morningstretches;

import java.util.Scanner;

public class StringReverser {

    private static final String WELCOME_MESSAGE = "Please enter the phrase you want reversed \r\nfollowed by return: ";

    public static void main(String[] args) {
        if(args.length > 1) {
            printReverse(args[0]);
        } else {
            System.out.print(WELCOME_MESSAGE);
            Scanner input = new Scanner(System.in);
            printReverse(input.nextLine());
        }
    }

    private static void printReverse(String inputArg) {
        for(int i = inputArg.length() - 1; i >= 0; i--) {
            System.out.print(inputArg.charAt(i));
        }
    }
}
