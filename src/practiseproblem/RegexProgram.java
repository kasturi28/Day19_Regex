package practiseproblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexProgram {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
/*
 * Taking input from the user for password using scanner function
 * Defining result & pattern for the program 
 */
		System.out.println("Enter a password");
		Scanner sc = new Scanner(System.in);
		String samplePassword= sc.nextLine();

		
		boolean result = Pattern.matches("[A-Z]{1,}[a-z]{6,}[0-9]{1,}", samplePassword);
/*
 * Printing the result
 */
		System.out.println("Result = " + result);

	}
}
