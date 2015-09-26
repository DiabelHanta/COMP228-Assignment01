package question1_Patient;

public class Patient 
{
	//Instance Class Variables
	private int _patientId;
	private String _firstName = "";
	private String _lastName = "";
	private String _address = "";
	private String _city = "";
	private String _postalCode = "";
				
	//Properties ####################################
	public int getPatientId()
	{
		return this._patientId;
	}
	
	public void setPatientId(int patientId) 
	{
		this._patientId = patientId;
	}
	
	public String getFirstName()
	{
		return this._patientId;
	}
	
	public void setFirstName(String firstName) 
	{
		this._firstName = firstName;
	}
	
	public String getLastName()
	{
		return this._patientId;
	}
	
	public void setLastName(String lastName) 
	{
		this._lastName = lastName;
	}
	
	public String getAddress()
	{
		return this._patientId;
	}
	
	public void setAddress(String address) 
	{
		this._address = address;
	}
	
	public String getCity()
	{
		return _patientId;
	}
	
	public void setCity(String city) 
	{
		this._city = city;
	}
	
	public String getPostalCode()
	{
		return _patientId;
	}
	
	public void setPostalCode(String postalCode) 
	{
		this._postalCode = postalCode;
	}
	
	//Constructor
		//Multiple Arguments
	public Patient(int _patientId, String _firstName, String _lastName,String _address, String _city, String _postalCode )
	{
		this._patientId = _patientId;
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._address = _address;
		this._city = _city;
		this._postalCode = _postalCode;
	}
	
		//Empty
	public Patient()
	{
	}
	
	//Method
	public void getPatientInfo()
	{
		System.out.printf("Patient ID: %s", this._patientId);
	}
}