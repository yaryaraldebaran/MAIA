package latihan.cucumberr.outlinecobain;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestOutlineImplementor {
	@When("^try method (.*) one (.*)$")
	public void try_method_username_one_password(String username, String password) {
		System.out.println("try method 1 "+username+password);
	}

	@When("^try method (.*) two (.*)$")
	public void try_method_username_two_password(String username,String password) {
		System.out.println("try method 2 "+username+password);
	}

	@Then("try method three")
	public void try_method_three() {
		System.out.println("ini method three");
	}

	@When("^try method (.*) satu (.*)$")
	public void try_method_username_satu_password(String username,String password) {
		System.out.println("try method 3 "+username+password);
	}

	@When("^try method (.*) dua (.*)$")
	public void try_method_username_dua_password(String username,String password) {
	    System.out.println("try method 4 "+username+password);
	}

	@Then("try method tiga")
	public void try_method_tiga() {
		System.out.println("ini method tiga");
	}



}
