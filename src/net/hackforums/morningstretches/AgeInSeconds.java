package net.hackforums.morningstretches;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 * Simple quick implementation of Age In Seconds.
 *
 * @author Cosa Nostra
 */
public final class AgeInSeconds {
    /**
     * The format expectations for the date.
     */
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(
            "yyyy-MM-dd");

    /**
     * The input source.
     */
    private static final Scanner INPUT_SOURCE = new Scanner(System.in);

    /**
     * The runner
     *
     * @param args Does nothing.
     */
    public static void main(String[] args) {
        // Initial prompt.
        System.out.println("Input your birthday (yyyy-mm-dd): ");
        try {
            // Print the difference in seconds from this instant.
            System.out.println(Date.from(Instant.now()).getTime()
                    - AgeInSeconds.DATE_FORMATTER.parse(
                    AgeInSeconds.INPUT_SOURCE.nextLine()).getTime());
        } catch (ParseException e) {
            // Recursively handle idiotic errors.
            System.out.println("Follow instructions, dipshit.");
            main(args); // May result in StackOverflow if user is braindead.
        }

        // Close the static instance of the scanner.
        AgeInSeconds.INPUT_SOURCE.close();
    }
}

