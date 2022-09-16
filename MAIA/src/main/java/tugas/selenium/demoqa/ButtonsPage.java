package tugas.selenium.demoqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.seleniumketiga.DriverSingleton;

public class ButtonsPage {
	private WebDriver driver;
	public ButtonsPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	/*
	 * id("doubleClickBtn")).click()
	 * id("B0kvj")).click()
	 */
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]")
	private WebElement doubleClickBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")
	private WebElement clickMe;
	
	//page object
	public void tekanButton() throws InterruptedException {
		doubleClickBtn.click();
		Thread.sleep(1000);
		doubleClickBtn.click();
//		clickMe.click();
	}
}
