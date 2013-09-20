package CustomerDatabase;

public class Address {

	private String StNumber = "";
	private String StName = "";
	private String AptNumber = "";
	private String City = "";
	private String State = "";
	private String ZipCode = "";
	
	public Address(){}
	public Address(String newStNumber, String newStName, String newAptNumber, String newCity, String newState, String newZipCode){
		setStNumber(newStNumber);
		setStName(newStName);
		setAptNumber(newAptNumber);
		setCity(newCity);
		setState(newState);
		setZipCode(newZipCode);
		
	}
	public String getStNumber(){
		return StNumber;	
	}
	public String getStName(){
		return StName;	
	}
	public String getAptNumber(){
		return AptNumber;	
	}
	public String getCity(){
		return City;
	}
	public String getState(){
		return State;	
	}
	public String getZipCode(){
		return ZipCode;	
	}
	public void setStNumber(String StNumber){
		this.StNumber=StNumber;
	}
	public void setStName(String StName){
		this.StName=StName;
	}
	public void setAptNumber(String AptNumber){
		this.AptNumber=AptNumber;
	}
	public void setCity(String City){
		this.City=City;
	}
	public void setState(String State){
		this.State=State;
	}
	public void setZipCode(String ZipCode){
		this.ZipCode=ZipCode;
	}
	
	
	public String toString(){
		return(StNumber + " " + StName+"  " + AptNumber + " " + City+ " " + State+ " " + ZipCode);
	}
	public String StNameOnly(){
		return(StNumber);
	}


	
}
