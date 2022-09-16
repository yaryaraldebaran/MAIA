package tugas.selenium.demoqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import latihan.seleniumketiga.DriverSingleton;

public class PracticeFormPage {
	private WebDriver driver;
	public PracticeFormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	/*
	 * id firstName
	 * id lastName
	 * id userName
	 * id dateOfBirthInput
	 * id uploadPicture
	 * id currentAddress
	 * id state
	 * id react-select-3-option-0
	 * id userFrom
	 * id currentAddress
	 * cssSelector path
	 * id click
	 * id closeLargeModal
	 */
	@FindBy(id = "firstName")
	private WebElement firstName;
	@FindBy(id = "lastName")
	private WebElement lastName;
	@FindBy(id = "userEmail")
	private WebElement userEmail;
	@FindBy(xpath = "//label[@for='gender-radio-1']")
	private WebElement rMale;
	
	@FindBy(xpath = "//label[@for='gender-radio-2']")
	private WebElement rFemale;
	@FindBy(id = "userNumber")
	private WebElement userNumber;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
	private WebElement dateOfBirthInput;
	@FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
	private WebElement sport;
	@FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
	private WebElement reading;
	@FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
	private WebElement music;
	@FindBy (xpath = "//input[@type='file']")
	private WebElement uploadPicture;
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]")
	private WebElement txtDoneUpload;

	@FindBy(id = "currentAddress")
	private WebElement currentAddress;
	@FindBy(id = "state")
	private WebElement state;
	@FindBy(id = "subjectsInput")
	private WebElement subjects;
	@FindBy(id = "submit")
	private WebElement submitBtn;
	@FindBy(id = "closeLargeModal")
	private WebElement closeLrgMdl;
	private WebElement city;
	
	public void isiTanggal(String tgl) {
		try {
			Robot rbt = new Robot();
			this.dateOfBirthInput.click();
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_A);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_A);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.dateOfBirthInput.sendKeys(tgl);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void isiSubject(String sub) {
		try {
			Robot rbt = new Robot();
			this.subjects.click();
			this.subjects.sendKeys(sub);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	//page object 
	public void isiForm(String fName, String lName, String emailUser, 
			String gnder,  String noHp, String dob,
			String subjct,int hobi,String direct,
			String currentAddres, String commentar ) throws InterruptedException, AWTException {
		Robot rb = new Robot();
		for(int i = 0; i<5; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		this.firstName.sendKeys(fName);
		this.lastName.sendKeys(lName);
		this.userEmail.sendKeys(emailUser);
		this.userNumber.sendKeys(noHp);
		isiTanggal(dob);
		isiSubject(subjct);
		switch(hobi) {
		case 1:
			this.sport.click();
			break;
		case 2:
			this.reading.click();
			break;
		case 3:
			this.music.click();
		default:
			;
		}
		this.currentAddress.sendKeys(currentAddres);
		this.uploadPicture.sendKeys(direct);
		rMale.click();
		Thread.sleep(1000);
		rFemale.click();
		Thread.sleep(1000);
		rMale.click();
		Thread.sleep(1000);
		state.click();
		Thread.sleep(500);
		List<WebElement> selectedItemState = driver.findElements(By.id("react-select-3-option-2"));
		selectedItemState.get(0).click();
		city.click();
		Thread.sleep(500);
		List<WebElement> selectedItemCity = driver.findElements(By.id("react-select-4-option-1"));
		selectedItemCity.get(0).click();
		submitBtn.click();
	}
	
	public String getTxtDoneUpload() {
		return txtDoneUpload.getText();
	}
}
