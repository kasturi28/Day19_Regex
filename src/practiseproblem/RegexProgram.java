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
 * Taking input from the user for last name using scanner function
 * Defining result & pattern for the program 
 */
		System.out.println("Enter last Name");
		Scanner sc = new Scanner(System.in);
		String sampleName = sc.nextLine();

		
		boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}", sampleName);
/*
 * Printing the results
 */
		System.out.println("Result = " + result);

	}
}
