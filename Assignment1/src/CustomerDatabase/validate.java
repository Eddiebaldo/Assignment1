package CustomerDatabase;



public class validate {
	public static String NameCheck (String Name){
		String result = "Valid Name";
		
		for (int y = 0; y < Name.length(); y++){
			if ((Name.charAt(y) >= 65 && Name.charAt(y) <= 90) ||
					(Name.charAt(y) >= 97 && Name.charAt(y) <= 122)){
				
			}
			else{
				result = "Name has invalid characters";
			}
		}
		return(result);
		
	}
	public static String EmailCheck (String Email){
		String result = "Valid Email";
		int atLoc = 0, perLoc = 0, atCount= 0, perCount = 0;
		
		
		for (int y = 0; y <Email.length(); y++){
			if ((Email.charAt(y)>=48 && Email.charAt(y)<=57)|| (Email.charAt(y)>=65 && Email.charAt(y)<=90)||
					(Email.charAt(y)>=97&& Email.charAt(y)<= 122 )|| (Email.charAt(y)==64)|| (Email.charAt(y)==46)
					|| (Email.charAt(y)==95)){
				
			}
			else{
				result = "Email contains invalid characters";
			}
			if (Email.charAt(y)==64){
				atLoc = y;
				atCount++;
				
			}
			if (Email.charAt(y)==46){
				perLoc= y;
				perCount++;
				
			}
		}
	if ((atLoc<1)|| (perLoc<1)){
		result = "Not a valid email";
	}
	if (perLoc < atLoc) {
		result = "Not a valid email";
		
	}
	if ((atCount >1)||(perCount>1)){
		result = "Not a valid email";
		
	}
		
		return(result);	
	}
	
}
