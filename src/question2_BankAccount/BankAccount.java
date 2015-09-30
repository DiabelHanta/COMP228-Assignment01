package question2_BankAccount;

import java.util.Scanner;

public class BankAccount
{
	//Private Instance Class Members
	private String _accountNumber; //Used String instead of int...
	private String _ownerName;
	private float _balance;
	private float _withdraw;
	private float _deposit;
	
	//Properties ####################################
		//_accountNumber properties
	public String getAccountNumber()
	{
		return this._accountNumber;
	}
	
	public void set_accountNumber(String _accountNumber) 
	{
		this._accountNumber = _accountNumber;
	}
	
		//_ownerName properties
	public String get_ownerName() 
	{
		return _ownerName;
	}

	public void set_ownerName(String _ownerName) 
	{
		this._ownerName = _ownerName;
	}
	
		//_balance properties
	public float get_balance() 
	{
		return _balance;
	}
	
		//_withdraw properties
	public float get_withdraw() 
	{
		return _withdraw;
	}
	
	public void set_withdraw(float _withdraw) 
	{
		this._withdraw = _withdraw;
	}

		//_deposit properties
	public float get_deposit() 
	{
		return _deposit;
	}

	public void set_deposit(float _deposit) 
	{
		this._deposit = _deposit;
	}
	
//	//Instance variable for choice (NOTE: To use in if statement w/i set_balance)
//	int choice;

	public void set_balance(float _balance) 
	{
//		//Prompting for WITHDRAW or DEPOSIT
//		System.out.println("Choose from the following options:\nEnter 1 to withdraw.\nEnter 2 to deposit");
//		
//		
//		
//		Scanner input = new Scanner(System.in);
//		
//		
//		//Conditional for WITHDRAW and DEPOSIT
//		if(choice == 1)
//		{
//			
//		}
		
		this._balance = _balance;
	}
	
	//Constructors
	//1. Multiple Argument Constructor
	public BankAccount(String _accountNumber, String _ownerName, float _balance)
	{
		this._accountNumber = _accountNumber;
		this._ownerName = _ownerName;
		this._balance = _balance;
	}
	
	//2. Empty
	public BankAccount()
	{
		
	}
	
	//Method: Goes back to driver and update user's new info into current info
	public void getAccountInfo()
	{
		//Old balance and current balance
		float oldBalance = this._balance;
		this._balance += _deposit; //Manipulates previous balance by using _deposit variable
		this._balance -= _withdraw; //Manipulates previous balance by using _withdraw variable
		System.out.printf("");
		
		//Reads out update info to the user
			//NOTE: Reads out the personal info
		System.out.printf("PERSONAL INFO:\n\tAccount: %s\n\tName: %s\n\tPrevious Balance: $%.2f", this._accountNumber, this._ownerName, oldBalance);
			//NOTE: Reads out the actual info
		System.out.printf("\n\nPROCESSED INFO:\n\tWithdrew: $%.2f\n\tDeposited: $%.2f, \n\tUpdated Balance: $%.2f", this._withdraw, this._deposit, this._balance);
		
//			//NOTE: Output of personal info as well as previous balance
//		System.out.printf("Previous Info: \nAccount: %s\tName: %s\tPrevious Balance: %.2f", this._accountNumber, this._ownerName, oldBalance);
//			//NOTE: Output of processing info (withdrawing and depositing) as well as update balance
//		System.out.printf("Processing Info: \nWithdrawal: %.2f\nDeposit: %.2f\nCurrent Balance: %.2f", this._withdraw, this._deposit, this._balance);
	}
}
