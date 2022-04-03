package www.bridgelabz.urp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

public class EmailSampleClass {
	@Test
	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();
// Valid email-ID		
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com");
		emails.add("abc-100@abc.net");
		emails.add("abc.100@abc.com.au");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc+100@gmail.com");
// Invalid email-ID		
		emails.add("abc");
		emails.add("abc@.com.my");
		emails.add("abc123@gmail.a");
		emails.add("abc123@.com");
		emails.add("abc123@.com.com");
		emails.add(".abc@abc.com");
		emails.add("abc()*@gmail.com");
		emails.add("abc@%*.com");
		emails.add("abc..2002@gmail.com");
		emails.add("abc.@gmail.com");
		emails.add("abc@abc@gmail.com");
		emails.add("abc@gmail.com.1a");
		emails.add("abc@gmail.com.aa.au");

		String regex = ("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
		Pattern pattern = Pattern.compile(regex);
		for (String value : emails) {
			Matcher matcher = pattern.matcher(value);
			System.out.println("The Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
		}
	}

}
