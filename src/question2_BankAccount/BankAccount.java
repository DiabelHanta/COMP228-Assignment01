package question2_BankAccount;

public class BankAccount 
{
	//Private Instance Class Members
	private int _accountNumber;
	private String _ownerName;
	private float _balance;
	
	//Properties ####################################
	public int getAccountNumber()
	{
		return this._accountNumber;
	}
	
	public void setAccountNumber(int patientId) 
	{
		this._accountNumber = patientId;
	}
	
	//Constructors
		//Multiple Argument Constructor
	public BankAccount(int _accountNumber, String _ownerName, float balance)
	{
		this._accountNumber = _accountNumber;
		this._ownerName = _ownerName;
		this._balance = _balance;
	}
	
		//Empty
	public BankAccount()
	{
		
	}
	
	//Method
	public void getAccountInfo()
	{
		System.out.println("");
	}
}
