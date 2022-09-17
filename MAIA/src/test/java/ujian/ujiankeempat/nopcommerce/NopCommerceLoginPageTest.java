package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.seleniumketiga.DriverSingleton;
import latihan.seleniumketiga.util.Constants;
import tugas.selenium.demoqa.AmazonAwsForm;

public class NopCommerceLoginPageTest {
	public static WebDriver driver;
	private NopCommerceLoginPage nclp;
	@BeforeMethod
	  public void pageObject() {
		  DriverSingleton.getInstance(Constants.CHROME);
			driver = DriverSingleton.getDriver();
			driver.get(Constants.URLNOPCOMMERCE);
			nclp = new NopCommerceLoginPage();
	  }
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	@Test(priority=0)
	public void testFormLoginComm() throws InterruptedException {
		nclp.isiFormLogin();
		//belum pake assertequals
	}
	@Test(priority=5)
	public void testFormLoginRememberMe() throws InterruptedException{
		nclp.loginRememberMe();
		driver.get(Constants.URLNOPCOMMERCE);
		assertTrue(nclp.getLoggedTxt().contains("logged")); 
	} 
	@Test(priority = 1)
	public void customerClick() throws InterruptedException {
		nclp.isiFormLogin();
		nclp.clickCustomer();
		assertTrue(nclp.getLearnMoreCust().contains("Learn more"));
		//belum pake assertequals
	}
	@Test(priority = 3)
	public void loginFail() throws InterruptedException {
		nclp.loginFail();
		assertTrue(nclp.getFailMsg().contains("unsuccessful"));
	}
	@Test(priority=4)
	public void loginLogout() throws InterruptedException {
		nclp.loginLogout();
		assertEquals(nclp.getLogoutTxt(),"Logout");
	}
}
