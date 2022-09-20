package tugas.selenium.demoqa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constant.Constants;
import latihan.selenium.framework.AutocompletePage;

public class RadioButtonPageTest {
	public static WebDriver driver;
	private RadioButtonPage rbp;
	@BeforeMethod
	public void pageObject() {
		//alur pertama pasti sngleton.getinstance
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLRADIOBUTTON);
		rbp = new RadioButtonPage();	
	}
  @Test
  public void testRadioButton() {
	  rbp.tekanRadioButton();
  }
}
