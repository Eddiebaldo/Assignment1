package CustomerDatabase;

import java.util.ArrayList;
import java.util.Scanner;




public class command {

	
	public static void main(String[]args){
		validate validateObj = new validate();
		validateId validateIdObj = new validateId();
		DateTime DateTimeObj = new DateTime();
		
	String request ="";
	String FirstName = "";
	String LastName = "";
	String Email = "";
	String Id = "";
	
	String StNumber = "";
	String StName = "";
	String AptNumber = "";
	String City = "";
	String State = "";
	String ZipCode = "";
	
	String DateTime="";
	String AId="";
	
	
	
	ArrayList <data> data = new ArrayList <data>();
	ArrayList <Address> Address = new ArrayList <Address>();
	ArrayList <Attendance> Attendance = new ArrayList <Attendance>();
	
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Welcome to Eddie's Club\n");
	System.out.print("1    - Enroll\n"+"Exit - End Program\n");
	
	while (!request.equalsIgnoreCase("Exit")){
		
		System.out.print("What would you like to do next?(press 9 to view more options)\n");
		
		
		request = keyboard.next();
		
		if (request.equalsIgnoreCase("9")){
			System.out.print("1 - Enroll\n"+"2 - Unenroll\n"+"3 - Check Enrollments\n"+"4 - Loggin your attendance\n" + "5 - Check Loggins\n"+ "Exit - End Program\n");
		}
		if(request.equalsIgnoreCase("4")){
			
			
			System.out.println("Please enter your student ID: ");
			AId = keyboard.next();
			if(validateIdObj.IdCheck(AId).equals("Valid Student ID")){
			System.out.println(DateTimeObj.getDateTime() + " Logged in");
			DateTime= DateTimeObj.getDateTime();
			
			System.out.println("");
			Attendance validforAttendance = new Attendance(DateTime, AId);
			Attendance.add(validforAttendance);
			System.out.println("Thank You for Checking in" );
			System.out.println("Checked in:");
			for (int y = 0; y<Attendance.size() ; y++  ){
				System.out.println((Attendance.get(y).toString()) );}}}
			
				
			
		
			else{System.out.println("");
				
			}
		if (request.equalsIgnoreCase("5")){
				System.out.println("");
				if(Attendance.size()==0){
				System.out.println("No One Has Checked in yet");
				System.out.println("");
				
						
			}else{
				System.out.println("Current Students Checked in:");
				for (int y = 0; y<Attendance.size(); y++ ){
					System.out.printf( Attendance.get(y).AIdOnly());
					System.out.println("");
					System.out.println("To view more info enter student ID: ");
					AId = keyboard.next();
					if(validateIdObj.IdCheck(AId).equals("Valid Student ID")){
						System.out.println("Date and Time for Check ins:");
						System.out.println(Attendance.get(y).toString());}
					
					
				}System.out.println("");
			}
				
		
			
		}
		if (request.equalsIgnoreCase("1")){
			System.out.println("Please enter your first name: ");
			FirstName = keyboard.next();
			System.out.println("Please enter your last name: ");
			LastName = keyboard.next();
			System.out.println("What is your e-mail: ");
			Email = keyboard.next();
			System.out.println("What is your student ID: " );
			Id = keyboard.next();
			System.out.println("Would you like to provide your Address?\n" + "y - yes\n" + "n -no\n");
			request = keyboard.next();
			if (request.equalsIgnoreCase("y")){
				System.out.println("Please enter your Street Number: ");
				StNumber = keyboard.next();
				System.out.println("Please enter your Street Name: ");
				StName = keyboard.next();
				System.out.println("Type 'n/a' if you don't have one/n" +"Please enter your Apt Number: ");
				AptNumber = keyboard.next();
				System.out.println("Please enter your City Name: ");
				City = keyboard.next();
				System.out.println("Please enter your State Name: ");
				State = keyboard.next();
				System.out.println("Please enter your ZipCode Name: ");
				ZipCode = keyboard.next();
				
				Address validforAddress = new Address(StNumber,StName, AptNumber, City, State, ZipCode);
				Address.add(validforAddress);
				System.out.println("Thank You for Enrolling" );
				System.out.println("Added Info:");
				for (int y = 0; y<Address.size() && y<data.size(); y++  ){
					System.out.println(Address.get(y).toString());
					System.out.println(data.get(y).toString() );
					
				
					
			}}else{
				System.out.println("Thank You for Enrolling");
			}
			
			
			if ((validateObj.NameCheck(FirstName).equals("Valid Name")) && (validateObj.NameCheck(LastName).equals("Valid Name"))
					&& (validateObj.EmailCheck(Email).equals("Valid Email")) && (validateIdObj.IdCheck(Id).equals("Valid Student ID"))) {
				data valid = new data(FirstName,LastName, Email, Id);
				data.add(valid);
				
				System.out.println("Current Students:");
				for (int y = 0; y<data.size(); y++ ){
					System.out.println(data.get(y).toString());
				
				
				}
				
			}
				
			else {
				System.out.println("not valid info please try again");
				
			}
		}
		if (request.equalsIgnoreCase("3")){
			System.out.println("");
			if(data.size()==0){
			System.out.println("No One is Enrolled");
			System.out.println("");
			
					
		}else{
			System.out.println("Current Students Enrolled:");
			for (int y = 0; y<data.size(); y++ ){
				System.out.println(data.get(y).IdOnly());
				
				System.out.println("To view more info enter student ID: ");
				Id = keyboard.next();
				if(validateIdObj.IdCheck(Id).equals("Valid Student ID")){
					System.out.println("Current Students:");
					System.out.println(data.get(y).toString());}
				
				
			}System.out.println("");
		}
			
	}
		
		if (request.equalsIgnoreCase("2")){ ///Delete 
			boolean found = false;
			System.out.println("Please enter student ID: ");
			Id = keyboard.next();
			
			if(validateIdObj.IdCheck(Id).equals("Valid Student ID")){
				for(int y = 0; y<data.size(); y++){
					if (Id.equals(data.get(y).getId())){
						
						System.out.println("Are you sure you would like to delete your account\n" + Id + " "+ FirstName +" " +LastName + " " + Email  );
						System.out.println("y - yes");
						Id = keyboard.next();
						switch (Id){
						case "y":
							data.remove(y);
							found=true;
							System.out.println("delete successful");
							System.out.println(""); break;
						default:	
							System.out.println("Account not deleted");
						}
						
						System.out.println("");
					}
				}
			}else{
				System.out.println("not valid Id\n");
				found = true;
			}
			if (found == false){
				System.out.println("Id doesnt exist\n");
			}
		}
		}
		}

	}

	