package tugas.selenium.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;


public class CheckBoxPage {
	private WebDriver driver;
	public CheckBoxPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	/*
	 * 
	 */
}
