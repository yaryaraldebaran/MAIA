package tugas.selenium.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;


public class TextBoxPage {
	private WebDriver driver;
	public TextBoxPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
/*
 * id: - userName
 * - userEmail
 * - currentAddress
 * - permanentAddress
 * - submit.click()
 */
	//page factory
	@FindBy(id = "userName")
	private WebElement username;
	@FindBy(id = "userEmail")
	private WebElement userEmail;
	@FindBy(id="currentAddress")
	private WebElement currentAddress;
	@FindBy(id="permanentAddress")
	private WebElement permanentAddress;
	@FindBy(id="submit")
	private WebElement submit;
	@FindBy(xpath="//p[@id='currentAddress']")
	private WebElement AlamatCurrentBawah;
	
	// page object 
	public void isiFormTextBox(String nama, String email, String alamat, String alamatPermanen) {
		this.username.sendKeys(nama);
		this.userEmail.sendKeys(email);
		this.currentAddress.sendKeys(alamat);;
		this.permanentAddress.sendKeys(alamatPermanen);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submit.click();
	}
	
	// validator
	public String getUsername() {
		return username.getText();
	}
	
	//yang email bisa dicek apakah ada @asdasdas.com atau tidak
	public String getUserEmail() {
		return userEmail.getText();
	}

	public String getCurrentAddress() {
		return currentAddress.getText();
	}

	public String getPermanentAddress() {
		return permanentAddress.getText();
	}
	public String getAlamatBawah() {
		return this.AlamatCurrentBawah.getText();
	}
}