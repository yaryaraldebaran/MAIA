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

import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constant.Constants;
import latihan.selenium.framework.AutocompletePage;
import latihan.seleniumketiga.pages.LoginPage;


public class TestAutoComplete {

	public static WebDriver driver;
	private AutocompletePage apg;
	
	
	@BeforeMethod
	public void pageObject() {
		//alur pertama pasti sngleton.getinstance
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLAUTOCOMPLETE);
		apg = new AutocompletePage();	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	
	// positive case
	@Test
	public void AutoCompletesst() {
		// bisa diubah ke datagenerator setiap fieldnya
		apg.manipulateAAL("Sukabumi");
		apg.manipulateCountry("Nigeria");
		apg.manipulateLocality("Jawa Barat");
		apg.manipulatePostalCode("342342");
		apg.manipulateRoute("121");
		apg.manipulateStreetNumber("12");
		apg.manipulateAddress("Jl. Kahuripan Bandung");
	}
	
}
