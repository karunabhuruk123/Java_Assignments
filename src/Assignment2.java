
//2.     Write a Java program to convert minutes into a number of years and days.
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] Strings) {

		double minutesInYear = 60 * 24 * 365;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter minutes: ");

		double min = input.nextDouble();

		long years = (long) (min / minutesInYear);
		int days = (int) (min / 60 / 24) % 365;

		System.out.println("years  " + years + "days " + days);
	}
}
