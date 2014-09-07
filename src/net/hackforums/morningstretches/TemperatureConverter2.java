package net.hackforums.morningstretches;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author CosaNostra
 */
public final class TemperatureConverter2 {
    /**
     * Source of data.
     */
    private static final Scanner SYSTEM_IN = new Scanner(System.in);

    /**
     * Required format for input.
     */
    private static final Pattern TEMP_PATTERN = Pattern
            .compile("([-]?\\d{1,3})([CcFf])");

    /**
     * The runner method.
     *
     * @param args Does nothing.
     */
    public static void main(String[] args) {
        // Initial prompt.
        System.out.println("Input a temperature (Example 10C / 62F):");

        // Regex matcher.
        final Matcher matcher = TemperatureConverter2.TEMP_PATTERN.matcher(TemperatureConverter2.SYSTEM_IN.nextLine());

        // Pattern checking.
        if (matcher.matches()) {
            // Grab the temp.
            final int temp = Integer.parseInt(matcher.group(1));

            // Output the opposite temp.
            System.out
                    .println(matcher.group(2).equalsIgnoreCase("f") ? (5.0 / 9.0)
                            * (temp - 32.0) + "C"
                            : (5.0 * temp) / 9.0 + 32.0 + "C");
        } else {
            // Show the error message.
            System.out.println("Follow instructions, dipshit.");
            main(args); // May result in StackOverflow if user is brain dead.
        }

        // Close the input.
        TemperatureConverter2.SYSTEM_IN.close();
    }
}

