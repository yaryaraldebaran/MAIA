package tugas.selenium.demoqa;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.seleniumketiga.DriverSingleton;
import latihan.seleniumketiga.util.Constants;

public class AmazonAwsFormTest {
	public static WebDriver driver;
	private AmazonAwsForm aws;
	@BeforeMethod
	  public void pageObject() {
		  DriverSingleton.getInstance(Constants.CHROME);
			driver = DriverSingleton.getDriver();
			driver.get(Constants.URLAMAZON);
			aws = new AmazonAwsForm();
	  }
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
  @Test
  public void amazonFormFilling() {
	  aws.fillFormAws("Mukis","Mujalid", "12-12-1998", 2,3, "Jl. Jakardi no 29", "jukirr@jmail.com", "jukidiganteng", "PT Kuninta", "Biasa aja hehe");
	  assertTrue(aws.getSuccess().contains("Successfully submitted!"));
  }
}
