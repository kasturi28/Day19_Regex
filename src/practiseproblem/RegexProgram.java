package practiseproblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexProgram {

	public static void main(String[] args) {

		System.out.println("Enter First Name");
		Scanner sc = new Scanner(System.in);
		String sampleName = sc.nextLine();

		// boolean result = Pattern.matches("Regex Pattern", sampleName);
		boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}", sampleName);

		System.out.println("Result = " + result);

	}
}
