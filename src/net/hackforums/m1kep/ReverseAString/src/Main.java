import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Used to read input from console.
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to M1kep's String Reverser!");
		System.out.print("Enter the string you would like to reverse and then press enter: ");
		// Set string 'plainString' equal to user input.
		char[] charArray = input.nextLine().toCharArray();
		String reversedString = "";
		// Iterate through the array in reverse and add the letters to the
		// string 'reversedString'
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversedString = reversedString + charArray[i];
		}
		System.out.println(reversedString);

	}
}
