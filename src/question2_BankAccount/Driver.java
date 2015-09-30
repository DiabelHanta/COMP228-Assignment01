package question2_BankAccount;

import java.util.Scanner;

public class Driver 
{
	//Object created from class: BankAccount
	public static BankAccount userBank;

	public static void main(String[] args) 
	{
		//Driver's Instance Variables
		String bankAccount; //Used String instead of int...
		String ownerName;
		float balance;
		float withdraw;
		float deposit;
		
		//User's input
		Scanner userInput = new Scanner(System.in);
		
		//Prompting user for input
		System.out.println("Please enter your bank account: ");
		bankAccount = userInput.nextLine();

		System.out.println("Please enter your name: ");
		ownerName = userInput.nextLine();
		
		System.out.println("Please enter your balance: ");
		balance = userInput.nextFloat();
		
		//Using the object: bank to "update" the new info provided by the user
		userBank = new BankAccount(bankAccount, ownerName, balance);
		
		//User enters withdrawal amount and then BankAccount's userBank object sets new withdraw account
		System.out.println("Enter how much you'd like to withdraw: ");
		withdraw = userInput.nextFloat();
		userBank.set_withdraw(withdraw);
		
		//User enters deposit amount and then BankAccount's userBank object sets new deposit account
		System.out.println("Enter how much you'd like to deposit: ");
		deposit = userInput.nextFloat();
		userBank.set_deposit(deposit);
		
		//BankAccount (Class)'s local object: userBank refers to its implemented method: getAccountInfo()
		userBank.getAccountInfo();
		
		////Debugging/Testing (IGNORE THIS!)
		//System.out.printf("Account: %s\nName: %s\nBalance: %.2f", bankAccount, ownerName, balance);
	}
}