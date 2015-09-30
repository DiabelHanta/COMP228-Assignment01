package question1_Patient;

import java.util.Scanner;

public class PatientDriver 
{
	//Instance Variable
	private static Patient patient; //reference to the Person class
	
	public static void main(String[] args) 
	{		
		//Instance Variables
		String patientID; //Used String instead of int...
		String fName;
		String lName;
		String address;
		String city;
		String postalCode;
		
		//Scanner variable type to get "user input"
		Scanner input = new Scanner(System.in);
		
		//Prompting for patient id
		System.out.println("Enter your id:");
		patientID = input.nextLine(); //Used nextLine instead of nextInt...
		
		//Prompting for first name
		System.out.println("Enter your first name:");
		fName = input.nextLine();
		
		//Prompting for last name
		System.out.println("Enter your last name:");
		lName = input.nextLine();
		
		//Prompting for address
		System.out.println("Enter your address:");
		address = input.nextLine();
		
		//Prompting for city
		System.out.println("Enter your city:");
		city = input.nextLine();
				
		//Prompting for postal code
		System.out.println("Enter your postal code:");
		postalCode = input.nextLine();
		
		//Console writes out what the user has entered
		System.out.printf("Your id is: %s", patientID);
		System.out.printf("\nYour first name is: %s", fName);
		System.out.printf("\nYour last name is: %s", lName);
		System.out.printf("\nYour address is: %s", address);
		System.out.printf("\nYour city is: %s", city);
		System.out.printf("\nYour postal code is: %s", postalCode);
	}
}