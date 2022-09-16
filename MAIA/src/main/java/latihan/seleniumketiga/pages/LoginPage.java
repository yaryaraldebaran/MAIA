package latihan.seleniumketiga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.seleniumketiga.DriverSingleton;

public class LoginPage {
	private WebDriver driver;
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// page factory 
	@FindBy (xpath = "//input[@placeholder='Username']")
	private WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtEmployee;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement txtInvld;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement rqrd;
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	private WebElement loginTitle;
	//page object untuk setiap aksi
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click();
	}
	public String getTxtEmp() {
		return txtEmployee.getText();
	}
	public String getInvlTxt() {
		return txtInvld.getText();
	}
	public String getUsern() {
		return this.username.getText();
	}
	public String getRqrd() {
		return this.rqrd.getText();
	}
	public String getLoginTitle() {
		return this.loginTitle.getText();
	}
}
