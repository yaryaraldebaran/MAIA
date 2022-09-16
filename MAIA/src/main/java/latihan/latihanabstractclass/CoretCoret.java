package latihan.latihanabstractclass;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class CoretCoret {

	public static void main(String[] args) {
		List <String>emails = new ArrayList<String>();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user#@domain.co.in");
		emails.add("user@domaincom");
		 
		//Invalid emails
		emails.add("user#domain.com");
		emails.add("@yahoo.com");
		 
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails){
		  java.util.regex.Matcher matcher = pattern.matcher(email);
		  System.out.println(email +" : "+ matcher.matches());
		}

	}

}
