/*
 * Kassondra Jone
 * Lab 3
 * January 24, 2018
 */


import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		int userNum;
		String userResponse;
		char userChoice;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Learn your squares and cubes!");
		System.out.println(" ");

		do {
			System.out.println("Enter an integer that is greater than or equal to 1: ");

			userNum = Integer.parseInt(scnr.nextLine()); // input comes in as a string, parse to int
			System.out.println(" ");

			if (userNum >= 1) {

				// Create a table from strings

				String table = "";
				table = table + "Number\t\tSquared\t\tCubed\n";
				table = table + "======\t\t=======\t\t======\n";

				// appends the rest of the rows to the table
				for (int i = 1; i <= userNum; i++) {
					int squared = i * i;
					int cubed = i * i * i;
					table += i + "\t\t" + squared + "\t \t" + cubed + "\n";
				}

				System.out.println(table);
				System.out.println("");

			}
			// System.out.println(table);

			System.out.println(" ");
			System.out.print("Would you like to continue?: (y/n) ");

			userResponse = scnr.nextLine();
			userChoice = userResponse.charAt(0);

			System.out.println(" ");

		} while (userChoice == 'y');

		System.out.println("Thank you for your time!");
		System.out.println("Goodbye!");

		scnr.close();
	}
}
