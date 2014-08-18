import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Used to read input from console.
		Scanner input = new Scanner(System.in);

		String reversedString = "";

		System.out.println("Welcome to M1kep's String Reverser!");
		System.out.println("Enter the string you would like to reverse and then press enter: ");
		// Set string 'plainString' equal to user input.
		String plainString = input.nextLine();
		// Convert string into an array of characters.
		char[] chars = plainString.toCharArray();
		// Iterate through the array in reverse and add the letters to the
		// string 'reversedString'
		for (int i = chars.length - 1; i >= 0; i--) {
			reversedString = reversedString + chars[i];
		}
		System.out.println(reversedString);

	}
}
