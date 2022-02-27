package www.bridgelabz.urp;

public class EnterLastName {
	
	public static void main(String[] args) {
		System.out.println(firstName("Shubham"));
		System.out.println(lastName("Nhalde"));
	}

	// validate first name
	public static boolean firstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

	// validate last name
	public static boolean lastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

}
