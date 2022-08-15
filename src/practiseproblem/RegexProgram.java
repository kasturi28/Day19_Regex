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
 * Taking input from the user for mobile number using scanner function
 * Defining result & pattern for the program 
 */
		System.out.println("Enter a mobile number");
		Scanner sc = new Scanner(System.in);
		String sampleNumber = sc.nextLine();

		
		boolean result = Pattern.matches("[9]{1}[1]{1}[0-9]{1,10}", sampleNumber);
/*
 * Printing the result
 */
		System.out.println("Result = " + result);

	}
}
