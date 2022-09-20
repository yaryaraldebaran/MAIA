package latihan.cucumberr.loginrunner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.cucumber.framework.constant.Constants;
import latihan.seleniumketiga.pages.LoginPage;

public class LoginOHRMImplementer {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage ohrm;
	
	
	public LoginOHRMImplementer() {
		driver = LoginOHRMHooks.driver;
		extentTest = LoginOHRMHooks.extentTest;
		ohrm=  new LoginPage();
	}
	
	@When("User go to web hrm")
	public void user_go_to_web_hrm() {
		driver.get(Constants.URLOHRM);
		assertTrue(ohrm.getTextLogin().contains("Login"));
		extentTest.log(LogStatus.PASS, "User go to web hrm");
	}
	@And("User enter username password valid")
	public void user_enter_username_password_valid() throws InterruptedException {
	    ohrm.login("admin", "admin123");
	    extentTest.log(LogStatus.PASS, "User fill username and password field");
	}


	@Then("User valid employee")
	public void user_valid_employee() {
		assertTrue(ohrm.getTxtEmp().contains("Employee"));
		extentTest.log(LogStatus.PASS, "Logged in");
	}
}
