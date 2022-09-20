package latihan.seleniumketiga.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import latihan.cucumber.framework.connection.DriverSingleton;

//import latihan.seleniumketiga.DriverSingleton;

public class LoginPage {
	private WebDriver driver;
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// page factory 
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]")
	private WebElement txtLogin;
	@FindBy (xpath = "//input[@placeholder='Username']")
	private WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]")
	private WebElement txtEmployee;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")//p[@class='oxd-text oxd-text--p oxd-alert-content-text']
	private WebElement txtCredential;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement txtInvld;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement rqrd;
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	private WebElement loginTitle;
	//page object untuk setiap aksi
	public void login(String username, String password) throws InterruptedException {
		System.out.println("username "+ username+" password "+password);
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click();
	}
	
//	public String getInvlTxt() {
//		return txtInvld.getText();
//	}
//	public String getUsern() {
//		return this.username.getText();
//	}
//	public String getRqrd() {
//		return this.rqrd.getText();
//	}
//	public String getLoginTitle() {
//		return this.loginTitle.getText();
//	}
	public String getTxtEmp() {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(txtEmployee)).getText();
	}
	
	
	public String getTextCredential() {
//		return txtCredential.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(txtCredential)).getText();
	}
	public String getTextLogin() {
//		return txtCredential.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(txtLogin)).getText();
	}
}
