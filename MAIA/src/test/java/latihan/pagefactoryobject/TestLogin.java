package latihan.pagefactoryobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.selenium.framework.AutocompletePage;
import latihan.seleniumketiga.DriverSingleton;
import latihan.seleniumketiga.pages.LoginPage;
import latihan.seleniumketiga.util.Constants;


public class TestLogin {

	public static WebDriver driver;
	private LoginPage loginPage;
	AutocompletePage apg;
	
	@BeforeClass
	public void setUp() {
		
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
//		driver.get(Constants.URL);
		//
		driver.get(Constants.URL);
		loginPage = new LoginPage();
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	
	// positive case
	@Test
	public void testValidLogin() {
//		HashMap<String, String> unamePassBnr= new HashMap<>();
//		unamePassBnr.put(, null)
		loginPage.login("Admin","admin123");
		String txtEmplExpect = "Employee Information";
		assertEquals(loginPage.getTxtEmp(), txtEmplExpect);
	}
	
	@Test
	public void testInvalidInvlText() {
		loginPage.login("Admiiini", "admin123");
		assertEquals(loginPage.getInvlTxt(), "Invalid credentials");
	}
	@Test
	public void testInvalidUsernameNull() {
		loginPage.login("", "admin123");
		assertEquals(loginPage.getRqrd(),"Required");
	}
	@Test
	public void testInvalidUsernameSalah() {
		loginPage.login("Admiiinn", "admin123");
		assertTrue(loginPage.getLoginTitle().contains("Login"));
	}
	@Test
	public void testInvalidPasswordNull() {
		loginPage.login("", "admin123");
		assertEquals(loginPage.getRqrd(),"Required");
	}
	
}
