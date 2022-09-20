package tugas.selenium.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;


public class RadioButtonPage {
	private WebDriver driver;
	public RadioButtonPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	/*
	 * //div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label
	 * //div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label
	 * //div[@id='app']/div/div/div[2]/div[2]/div[2]/div[4]/label
	 */
	@FindBy(xpath="//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")
	private WebElement radioButton1;
	@FindBy(xpath ="//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")
	private WebElement radioButton2;
	@FindBy(xpath = "//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[4]/label")
	private WebElement radioButton3;
	
	//page object
	public void tekanRadioButton() {
		radioButton1.click();
		radioButton2.click();
		radioButton3.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioButton1.click();
		radioButton2.click();
	}
}
