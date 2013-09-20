package CustomerDatabase;

import java.util.ArrayList;
import java.util.Scanner;



public class command {

	
	public static void main(String[]args){
		validate validateObj = new validate();
		validateId validateIdObj = new validateId();
		
	String request ="";
	String FirstName = "";
	String LastName = "";
	String Email = "";
	String Id = "";
	ArrayList <data> data = new ArrayList <data>();
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Welcome to Eddie's Club\n");
	System.out.print("1 - Enroll\n"+"4 - Exit\n");
	
	while (!request.equalsIgnoreCase("4")){
		
		System.out.print("What would you like to do next?(press 5 to view more options)\n");
		
		
		request = keyboard.next();
		
		if (request.equalsIgnoreCase("5")){
			System.out.print("1 - Enroll\n"+"2 - Unenroll\n"+"3 - Check Enrollments\n"+"4 - Edit Enrollments\n" + "5 - Exit\n");
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
			
			if ((validateObj.NameCheck(FirstName).equals("Valid Name")) && (validateObj.NameCheck(LastName).equals("Valid Name"))
					&& (validateObj.EmailCheck(Email).equals("Valid Email")) && (validateIdObj.IdCheck(Id).equals("Valid Student ID"))) {
				data valid = new data(FirstName,LastName, Email, Id);
				data.add(valid);
				System.out.println("Thank You for Enrolling" );
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
		
		if (request.equalsIgnoreCase("2")){
			boolean found = false;
			System.out.println("Please enter student ID: ");
			Id = keyboard.next();
			
			if(validateIdObj.IdCheck(Id).equals("Valid Student ID")){
				for(int y = 0; y<data.size(); y++){
					if (Id.equals(data.get(y).getId())){
						System.out.println("Are you sure you would like to delete your account\n" + Id + " "+ FirstName +" " +LastName + " " + Email);
						Id = keyboard.next();
						switch (Id){
						case "1":
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

	