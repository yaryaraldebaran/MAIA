package latihan.cucumberr.ohrmoutline;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.cucumber.framework.constant.Constants;
import latihan.cucumberr.loginrunner.LoginOHRMHooks;
import latihan.seleniumketiga.pages.LoginPage;

public class OHRMOutlineImplementor {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage ohrm;
	
	
	public OHRMOutlineImplementor() {
		driver = OHRMOutlineHooks.driver;
		extentTest = OHRMOutlineHooks.extentTest;
		ohrm=  new LoginPage();
	}
		
	
	@When("User go to web hrm outline")
	public void user_go_to_web_hrm() {
	    driver.get(Constants.URLOHRM);
	    extentTest.log(LogStatus.PASS, "User go to web hrm");
	}

	@And("^User enter (.*) (.*) valid$")
	public void user_enter_username_password_valid(String uname,String pw) throws InterruptedException {
	    ohrm.login(uname, pw);
	    extentTest.log(LogStatus.PASS, "User fill the username and password field");
	}
	
	@And("User invalid")
	public void user_invalid() throws InterruptedException {
	    assertTrue(ohrm.getTextCredential().contains("invalid"));
	    System.out.println(ohrm.getTextCredential());
	    extentTest.log(LogStatus.FAIL, "User and password not invalid");
	}
}
