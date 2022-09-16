package tugas.selenium.demoqa;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.seleniumketiga.DriverSingleton;
import latihan.seleniumketiga.util.Constants;

public class TextBoxPageTest {
	public static WebDriver driver;
	private TextBoxPage txtBoxPage;
	
  @BeforeMethod
  public void pageObject() {
	  DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLTEXTBOX);
		txtBoxPage = new TextBoxPage();
  }
  @AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
  @Test
  public void testValidForm() {
	  txtBoxPage.isiFormTextBox("Rukadi", "rukadi@ymail.com", "Jl. Maungsinga", "Jl.Purnada");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("ini adalah "+txtBoxPage.getAlamatBawah());
	  assertTrue(txtBoxPage.getAlamatBawah().length()!=0);
  }
}
