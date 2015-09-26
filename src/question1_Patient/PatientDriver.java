package question1_Patient;

import java.util.Scanner;

public class PatientDriver {

	public static void main(String[] args) {
System.out.println("Question 1 - Patient");
		
		Scanner input = new Scanner(System.in);
		
		//Prompting for first name
		System.out.println("Enter your patient id:");
		int patientID = input.nextInt();
		
		//Prompting for first name
		System.out.println("Enter your first name:");
		String fName = input.nextLine();
		
		//Prompting for last name
		System.out.println("Enter your last name:");
		String lName = input.nextLine();
		
		//Prompting for address
		System.out.println("Enter your address:");
		String address = input.nextLine();
		
		//Prompting for city
		System.out.println("Enter your city:");
		String city = input.nextLine();
				
		//Prompting for postal code
		System.out.println("Enter your postal code:");
		String postalCode = input.nextLine();
		
		//Console writes out what the user has entered
		System.out.printf("Your first name is: %s\nYour last name is: %s", fName, lName);
	}
}