package ujian.ujiankelima.selenium.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import latihan.cucumber.framework.utils.Utils;

import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constant.Constants;

public class DemoQAShopMyAccount {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public DemoQAShopMyAccount() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//component saat login
	@FindBy(xpath ="/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement homeBtn;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement loginBtn;
	@FindBy(id ="rememberme")
	private WebElement rememberMeCheck;
	@FindBy(linkText = "Dismiss")
	private WebElement dismissAwalBtn;
	@FindBy(xpath="//a[normalize-space()='The New Marc Jacobs Gotham Saddle Bag']")
	private WebElement marcJacobBtn;
	@FindBy(xpath = "//input[@id='submit']")
	private WebElement submitCommentBtn;
	
	//register section
	@FindBy(xpath="//input[@id='reg_username']")
	private WebElement regUsername;
	@FindBy(xpath="//input[@id='reg_email']")
	private WebElement regEmail;
	@FindBy(xpath= "//input[@id='reg_password']")
	private WebElement regPassword;
	
	
	//component validator
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement addedToCart;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/input[1]")
	private WebElement quantityTotal;
	@FindBy(className = "woocommerce-thankyou-order-received")
	private WebElement ordered;
	@FindBy(xpath = "//td[@class='wishlist-empty']")
	private WebElement wishlistEmpty;
	@FindBy(xpath="//div[@aria-live='polite']")
	private WebElement passwordStrength;
	
	//scenario1
	public void register(String username,String email, String password) {
		
		Utils.delay(1, strDelay);
		this.regUsername.sendKeys(username);
		Utils.delay(2, strDelay);
		this.regEmail.sendKeys(email);
		Utils.delay(1, strDelay);
		this.regPassword.sendKeys(password);
		Utils.delay(2, strDelay);
		
	}
	public String getPwStrngth() {
		return this.passwordStrength.getText().toString();
	} 
}
