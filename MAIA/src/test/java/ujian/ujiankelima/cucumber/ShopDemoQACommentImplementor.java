package ujian.ujiankelima.cucumber;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.cucumber.framework.constant.Constants;
import latihan.cucumberr.loginrunner.LoginOHRMHooks;
import latihan.seleniumketiga.pages.LoginPage;
import ujian.ujiankelima.selenium.page.DemoQAShopComment;
import ujian.ujiankelima.selenium.page.DemoQAShopHome;

public class ShopDemoQACommentImplementor {
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private DemoQAShopComment dmQA;
	
	
	public ShopDemoQACommentImplementor() {
		driver = ShopDemoQAOutlineHooks.driver;
		extentTest = ShopDemoQAOutlineHooks.extentTest;
		dmQA = new DemoQAShopComment();
	}
		
	
	@When("User go to marc jacobs gotham saddle bag")
	public void user_go_to_marc_jacobs_gotham_saddle_bag() {
		driver.get(Constants.URLCOMMENT);
		extentTest.log(LogStatus.PASS, "User go to web shop demo qa comment");
	}

	@And("^User enter (.*), (.*), (.*), (.*) invalid$")
	public void user_enter_username_email_comment_captcha_invalid(String nama, String email,String komen,String captchau) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1100)", "");
		try {
			dmQA.commenting(nama, komen, email, captchau);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.log(LogStatus.PASS, "User fill comment field");
	}

	@Then("Comment invalid")
	public void comment_invalid() {
		assertTrue(dmQA.getErrorTxt().contains("Error"));
		extentTest.log(LogStatus.PASS, "User comment field is invalid");
	}

}
