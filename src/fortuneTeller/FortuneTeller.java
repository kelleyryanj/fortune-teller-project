package fortuneTeller;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		String favoriteColor;
		String yourAge;
		String yourBirthMonth;
		String yourSiblings;
		boolean quit = true;
		do {

			System.out.println(
					"Hello, I am going to ask you a series of questions and then I will tell you your future.");

			System.out.println("What is your first and last name?");

			firstName = input.nextLine();
			if (firstName.toLowerCase().contains("quit")) {
				quit = false;
				break;
			} else {
				quit = true;

			}

			lastName = input.nextLine();
			if (lastName.toLowerCase().equals("quit")) {
				quit = false;
				break;
			} else {
				quit = true;
			}

			System.out.println(
					"What is your favorite ROYGBIV color? Type help if you're confused as to what colors these are.");
			favoriteColor = input.nextLine();
			if (favoriteColor.toLowerCase().equals("quit")) {
				quit = false;
				break;
			} else {
				quit = true;
			}

			while (favoriteColor.toLowerCase().equals("help")) {
				System.out.println("the colors are red, orange, green, yellow, blue, indigo, and violet");
				System.out.println("What is your favorite color");
				favoriteColor = input.nextLine();
			}

			System.out.println("What is your age?");
			yourAge = input.nextLine();

			if (yourAge.toLowerCase().equals("quit")) {
				quit = false;
				break;
			} else {
				quit = true;
			}
			int age = Integer.parseInt(yourAge);

			System.out.println("What is the number of your birth month?");
			yourBirthMonth = input.nextLine();

			if (yourBirthMonth.toLowerCase().equals("quit")) {
				quit = false;
				break;
			} else {
				quit = true;
			}
			int birthMonth = Integer.parseInt(yourBirthMonth);

			System.out.println("How many siblings do you have? Please enter as a number.");
			yourSiblings = input.nextLine();

			if (yourSiblings.toLowerCase().equals("quit")) {
				quit = false;
				break;
			} else {
				quit = true;
			}
			int siblings = Integer.parseInt(yourSiblings);

			switch (favoriteColor.toLowerCase()) {
			case "red":
				favoriteColor = "Ford F150"; break;
			case "orange":
				favoriteColor = "flapping your arms"; break;
			case "yellow":
				favoriteColor = "VW Beetle"; break;
			case "green":
				favoriteColor = "boat"; break;
			case "blue":
				favoriteColor = "Ferrari 458"; break;
			case "indigo":
				favoriteColor = "goat"; break;
			case "violet":
				favoriteColor = "Uber"; break;
			default:
				favoriteColor = "rolling around"; break;
			}

			int retirementAge;
			if ((age % 2) == 0) {
				retirementAge = 12;
			} else {
				retirementAge = 14;
			}

			String retirementHome;
			if (siblings == 0) {
				retirementHome = "Naples, FL";
			} else if (siblings == 1) {
				retirementHome = "San Diego, Ca";
			} else if (siblings == 2) {
				retirementHome = "Pheonix, AZ";
			} else if (siblings == 3) {
				retirementHome = "Seattle, WA";
			} else if (siblings > 3) {
				retirementHome = "Cancun, Mexico";
			} else {
				retirementHome = "Death Valley, CA";
			}

			double account;
			switch (birthMonth) {
			case 1 :
				account = 256000.76; break;
			case 2 :
				account = 256000.76; break;
			case 3 :
				account = 256000.76; break;
			case 4 :
				account = 256000.76; break;
			case 5 :
				account = 3687105.42; break;
			case 6 :
				account = 3687105.42; break;
			case 7 :
				account = 3687105.42; break;
			case 8 :
				account = 3687105.42; break;
			case 9 :
				account = 86.23; break;
			case 10 :
				account = 86.23; break;
			case 11 :
				account = 86.23; break;
			case 12 :
				account = 86.23; break;
			default :
				account = 0; break;
			}

			NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

			System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " years with "
					+ currency.format(account) + " in a vacation home in " + retirementHome + " and travel by "
					+ favoriteColor + ".");
			System.out.println("Thanks for playing!");
			System.exit(0);
		} while (quit == true);
		System.out.println("nobody likes a quitter....");
		System.exit(0);
		input.close();
	}
}
