package CustomerDatabase;



public class validateId {
	
	public static String IdCheck(String Id){
		String result = "Valid Student ID";
		int length = 0; 
		int numCount = 0; 
		int capCount = 0; 
		
		//Checks if the Student ID is valid
		
		for(int y=0; y<Id.length(); y++){
			if((Id.charAt(y)>=47 && Id.charAt(y)<=58)|| (Id.charAt(y)>64 && Id.charAt(y)<91)||
				(Id.charAt(y)>=97 && Id.charAt(y)<= 122)){
				
			}
			else {
				result = "ID Contains Invalid Character!"	;
				
			}
			if ((Id.charAt(y)>47 && Id.charAt(y)<58)){
				numCount ++;
					
			}
			if ((Id.charAt(y)> 64 && Id.charAt(y)<91)){
				capCount++;
				
			}
			length = (y+1);
			
		}
		if (numCount <7){
			result = "Not Enough Numbers in ID";
			
		}
		
		if (length <8)	{
			result = "Id is too short";
			
		}
		return(result);
		
	}


}
