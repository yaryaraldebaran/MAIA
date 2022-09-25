package ujian.ujiankelima.cucumber;

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
import ujian.ujiankelima.selenium.page.DemoQAShopHome;
import ujian.ujiankelima.selenium.page.DemoQAShopMyAccount;

public class ShopDemoQARegisterImplementor {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private DemoQAShopMyAccount dmQA;
	
	
	public ShopDemoQARegisterImplementor() {
		driver = ShopDemoQAOutlineHooks.driver;
		extentTest = ShopDemoQAOutlineHooks.extentTest;
		dmQA = new DemoQAShopMyAccount();
	}
		
	
	@When("User go to register page shop demo qa")
	public void user_go_to_register_page_shop_demo_qa() {
		driver.get(Constants.URLREGISTERSHOPDEMOQA);
		extentTest.log(LogStatus.PASS, "User go to register page demoqa shop");
	}

	@And("^User enter (.*), (.*), and (.*) invalid$")
	public void user_enter_username_password_and_email_invalid(String username, String email, String password) {
		dmQA.register(username,email, password);
		extentTest.log(LogStatus.PASS, "User fills registration field");
	}

	@Then("User invalid register")
	public void user_invalid_employee() {
		assertTrue(dmQA.getPwStrngth().contains("Weak"));
		extentTest.log(LogStatus.PASS, "User's password is weak");
//		System.out.println(dmQA.getPwStrngth());
	}

}
