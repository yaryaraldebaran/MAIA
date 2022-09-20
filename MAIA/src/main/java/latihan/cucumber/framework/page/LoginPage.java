package latihan.cucumber.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;


public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	//input[contains(@attr, 'value')]
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgError;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtEmpInfo;
	
	//scenario
	public void login(String username, String password) {
		this.username.sendKeys(username); //step
		this.password.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	//Actual
	public String msgInvalid() {
		return msgError.getText();
	}
	
	public String getTxtEmpInfo() {
		return txtEmpInfo.getText();
	}
	
}
