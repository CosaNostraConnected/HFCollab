package net.hackforums.morningstretches;

import java.util.Scanner;

public class StringReverser {

    private static final String WELCOME_MESSAGE = "Please enter the phrase you want reversed \r\nfollowed by return: ";

    public static void main(String[] args) {
        if(args.length > 1) {
            reverse(args[0]);
        } else {
            System.out.print(WELCOME_MESSAGE);
            Scanner input = new Scanner(System.in);
            reverse(input.nextLine());
        }
    }

    private static void reverse(String inputArg) {
        char[] inputCharacters = new char[inputArg.length()];
        inputArg.getChars(0, inputArg.length(), inputCharacters, 0);
        for(int i = inputCharacters.length - 1; i >= 0; i--) {
            System.out.print(inputCharacters[i]);
        }
    }
}
