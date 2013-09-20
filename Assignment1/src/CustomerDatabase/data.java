package CustomerDatabase;

public class data {
	private String FirstName = "";
	private String LastName = "";
	private String Email = "";
	private String Id = "";
	
	public data(){}
	public data(String newFirstName, String newLastName, String newEmail, String newId){
		setFirstName(newFirstName);
		setLastName(newLastName);
		setEmail(newEmail);
		setId(newId);
		
	}
	public String getFirstName(){
		return FirstName;
		
	}
	public String getLastName(){
		return LastName;
	}
	public void setFirstName(String FirstName){
		this.FirstName=FirstName;
	}
	public void setLastName(String LastName){
		this.LastName=LastName;
	}
	public String getEmail(){
		return Email;
		
	}
	public String getId(){
		return Id;
		
	}
	
	public void setEmail(String Email){
		this.Email = Email;
	}
	public void setId(String Id){
		this.Id = Id;
	}
	public String toString(){
		return(Id + " " + FirstName+"  " + LastName + " " + Email );
	}
	public String IdOnly(){
		return(FirstName+" "+ LastName);
	}



}
