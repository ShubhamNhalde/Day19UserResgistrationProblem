package www.bridgelabz.urp;

import java.util.regex.Pattern;
import org.junit.Test;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UserRegistrationProblem {

	public static void main(String[] args) {
		UserRegistration rv = new UserRegistration();
		rv.firstname();
		rv.lastname();
		rv.validEmail();
		rv.preDefinedMobileFormat();
		rv.min8character();
	}
}

class UserRegistration {

	@Test
	public void firstname() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the First Name - Starts with Cap and has minimum 3 characters");
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		String firstName = userInput.next();
		Matcher matcher = p.matcher(firstName);
		if (matcher.find()) {
			System.out.println("First Name => " + firstName);
		} else {
			System.out.println("Invalid Character");
		}
	}

	@Test
	public void lastname() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the Last Name - Starts with Cap and has minimum 3 characters");
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		String lastName = userInput.next();
		Matcher matcher = p.matcher(lastName);
		if (matcher.find()) {
			System.out.println("Last Name => " + lastName);
		} else {
			System.out.println("Invalid Character");
		}
	}

	@Test
	void validEmail() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a valid email");
		String regex = ("^(.+)@(.+)$");
		String email = userInput.next();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find()) {
			System.out.println("email => " + email);
		} else {
			System.out.println("Invalid email");
		}
	}

	@Test
	public void preDefinedMobileFormat() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a mobile number");
		String mobileNumber = userInput.next();
		Pattern pattern = Pattern.compile("[1-9]{2}[ \\S\\s]{1}+[1-9]*]");
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.find()) {
			System.out.println("pre-defined Mobile number => " + mobileNumber);
		} else {
			System.out.println("Invalid Mobile format");
		}
	}

	@Test
	void min8character() {
		Scanner userInput = new Scanner(System.in);
		System.out.println(
				"Enter the Password - min 8 character, Should have at least 1 Upper Case, Numeric number and Special character");
		String password = userInput.next();
		Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
		Matcher matcher = pattern.matcher(password);
		if (matcher.find()) {
			System.out.println("Password => " + password);
		} else {
			System.out.println("Invalid Password");
		}
	}

}
