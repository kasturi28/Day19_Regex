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
 * Taking input from the user for e-mail using scanner function
 * Defining result & pattern for the program 
 */
		System.out.println("Enter e-mail");
		Scanner sc = new Scanner(System.in);
		String sampleMail = sc.nextLine();

		
		boolean result = Pattern.matches("[a-c]{3}[.][a-z]{3}[@][b]{1}[l]{1}[.][c]{1}[o]{1}[.][a-z]{1,2}", sampleMail);
/*
 * Printing the result
 */
		System.out.println("Result = " + result);

	}
}
