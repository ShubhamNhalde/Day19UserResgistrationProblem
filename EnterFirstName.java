package www.bridgelabz.urp;

public class EnterFirstName {
	
	public static void main(String[] args) {
		System.out.println(firstName("Shubham"));
	}
	//validate first name	
	public static boolean firstName(String FirstName )  {
		return FirstName.matches("^[A-Z]{1}[a-z]{2,}$");
		
	}


}
