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

public class DemoQAShopComment {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public DemoQAShopComment() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//component saat login
	@FindBy(xpath="//a[normalize-space()='The New Marc Jacobs Gotham Saddle Bag']")
	private WebElement marcJacobBtn;
	@FindBy(xpath = "//input[@id='submit']")
	private WebElement submitCommentBtn;
	@FindBy(id="author")
	private WebElement author;
	@FindBy(id="url")
	private WebElement url;
	@FindBy(id="comment")
	private WebElement comment;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/strong[1]/input[3]")
	private WebElement capca;
	@FindBy(xpath="//input[@id='submit']")
	private WebElement submitBtn;
	//component utama setelah login
		
	//component validator
	@FindBy(xpath="//strong[normalize-space()='Error']")
	private WebElement errorTxt;
	//scenario1
	public void commenting(String names,String comments, String emails, String capcaus) throws InterruptedException {
		
		this.author.sendKeys(names);
		Utils.delay(1, strDelay);
		this.comment.sendKeys(comments);
		Utils.delay(2, strDelay);
		this.email.sendKeys(emails);
		Utils.delay(2, strDelay);
		this.capca.sendKeys(capcaus);
		Utils.delay(2, strDelay);
		this.submitBtn.click();
		Utils.delay(4, strDelay);
	}
	public String getErrorTxt() {
		return this.errorTxt.getText().toString();
	}
	
}
