package tugas.selenium.demoqa;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.seleniumketiga.DriverSingleton;
import latihan.seleniumketiga.util.Constants;

public class ButtonsPageTest {
	public static WebDriver driver;
	private ButtonsPage btnpg;
	
  @BeforeMethod
  public void pageObject() {
	  DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLBUTTONS);
		btnpg = new ButtonsPage();
		
  }
  @AfterMethod
  public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
  @Test
  public void testValidButton() throws InterruptedException, AWTException {
	  btnpg.tekanButton();
	  Thread.sleep(3000);
  }
}
