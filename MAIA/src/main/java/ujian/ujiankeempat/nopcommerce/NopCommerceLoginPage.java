package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.seleniumketiga.DriverSingleton;

public class NopCommerceLoginPage {
	private WebDriver driver;
	public NopCommerceLoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement email;
	@FindBy (id="Password")
	private WebElement password;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	@FindBy (id ="RememberMe")
	private WebElement rememberMeRad;
	
	//setelah masuk
	@FindBy(linkText="Customers")
	private WebElement customerBtn;
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Clear cache'])[1]/following::p[22]")
	private WebElement chooseCustomer;
	@FindBy(linkText = "Logout")
	private WebElement logoutBtn;

	//validator
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]")
	private WebElement textLoginFail;
	@FindBy (xpath="/html[1]/body[1]/div[3]/nav[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement logoutValidator;
	@FindBy (xpath ="/html[1]/body[1]/div[5]/div[1]/p[1]")
	private WebElement alreadyLoggedValidator;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	private WebElement LearnMoreAboutCust;
	
	//page object
	public void isiFormLogin() throws InterruptedException {
		this.email.clear();
		Thread.sleep(500);
		this.email.sendKeys("admin@yourstore.com");
		this.password.clear();
		this.password.sendKeys("admin");
		this.submitBtn.click();
	}
	public void loginRememberMe() throws InterruptedException {
		this.email.clear();
		Thread.sleep(500);
		this.email.sendKeys("admin@yourstore.com");
		this.password.clear();
		this.password.sendKeys("admin");
		this.rememberMeRad.click();
		this.submitBtn.click();
	}
	public void clickCustomer() {
		this.customerBtn.click();
		this.chooseCustomer.click();
	}
	public void loginFail() throws InterruptedException {
		this.email.clear();
		this.email.sendKeys("adminlupa@mail.com");
		this.password.clear();
		this.password.sendKeys("passwordsalah");
		this.submitBtn.click();
	}
	public void loginLogout() throws InterruptedException {
		this.email.clear();
		this.email.sendKeys("admin@yourstore.com");
		this.password.clear();
		this.password.sendKeys("admin");
		this.submitBtn.click();
		Thread.sleep(1000);
		this.logoutBtn.click();
	}
	
	//getter component
	public String getFailMsg() {
		System.out.println("=========="+this.textLoginFail.toString());
		return this.textLoginFail.getText();
	}
	public String getLogoutTxt() {
		return this.logoutValidator.getText();
	}
	public String getLoggedTxt() {
		return this.alreadyLoggedValidator.getText();
	}
	public String getLearnMoreCust() {
		return this.LearnMoreAboutCust.getText();
	}
}
