package question1_Patient;

public class Patient 
{
	//Instance Class Variables
	private String _patientId; //USED: String instead of int...
	private String _firstName; //NOTE: DO WE NEED: = ""
	private String _lastName; //NOTE: DO WE NEED: = ""
	private String _address; //NOTE: DO WE NEED: = ""
	private String _city; //NOTE: DO WE NEED: = ""
	private String _postalCode; //NOTE: DO WE NEED: = ""
				
	//Properties 
	public String getPatientId()
	{
		return _patientId;
	}
	
	public void setPatientId(String patientId) 
	{
		this._patientId = patientId;
	}
	
	public String getFirstName()
	{
		return _firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this._firstName = firstName;
	}
	
	public String getLastName()
	{
		return _lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this._lastName = lastName;
	}
	
	public String getAddress()
	{
		return _address;
	}
	
	public void setAddress(String address) 
	{
		this._address = address;
	}
	
	public String getCity()
	{
		return _city;
	}
	
	public void setCity(String city) 
	{
		this._city = city;
	}
	
	public String getPostalCode()
	{
		return _postalCode;
	}
	
	public void setPostalCode(String postalCode) 
	{
		this._postalCode = postalCode;
	}
	
	//Constructor
		//Multiple Arguments
	public Patient(String _patientId, String _firstName, String _lastName,String _address, String _city, String _postalCode )
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