package CustomerDatabase;



public class Attendance {

	private String DateTime = "";
	private String AId = "";
	
	
	public Attendance(){}
	public Attendance(String newDateTime, String newAId){
		setDateTime(newDateTime);
		
		setAId(newAId);
		
		
	}
	public String getDateTime(){
		return DateTime;	
	}
	
	public String getAId(){
		return AId;
	}
	public void setDateTime(String DateTime){
		this.DateTime=DateTime;
	}
	
	public void setAId(String AId){
		this.AId = AId;
	}
	
	public String toString(){
		return(DateTime+ " " + AId);
	}
	public String AIdOnly(){
		return(AId);
	}
	


	
}
