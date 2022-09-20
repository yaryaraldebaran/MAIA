package tugas.selenium.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;



public class AmazonAwsForm {
	private WebDriver driver;
	public AmazonAwsForm() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="first-name")
	private WebElement firstName;
	@FindBy(id ="last-name")
	private WebElement lastName;
	@FindBy(id ="dob")
	private WebElement dob;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/label[1]/input[1]")
	private WebElement genderMale;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/label[2]/input[1]")
	private WebElement genderFemale;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/label[3]/input[1]")
	private WebElement inBetween;
	@FindBy(id ="address")
	private WebElement address;
	@FindBy(id ="email")
	private WebElement email;
	@FindBy(id ="password")
	private WebElement password;
	@FindBy(id ="company")
	private WebElement company;
	@FindBy(id ="comment")
	private WebElement comment;
	@FindBy(id ="submit")
	private WebElement submitBtn;
	@FindBy(xpath="//label[normalize-space()='Read books']//input[@type='checkbox']")
	private WebElement checkRad1;
	@FindBy(xpath="//label[normalize-space()='Take online courses']//input[@type='checkbox']")
	private WebElement checkRad2;
	@FindBy(xpath="//label[normalize-space()='Contribute to opensource projects']//input[@type='checkbox']")
	private WebElement checkRad3;
	@FindBy(xpath = "//label[normalize-space()='Join tech cons']//input[@type='checkbox']")
	private WebElement checkRad4;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[13]/div[1]/button[1]")
	private WebElement btn;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[13]/div[1]/span[1]")
	private WebElement succestxt;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[10]/div[1]/select[1]/option[1]")
	private WebElement highSalary;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[10]/div[1]/select[1]/option[2]")
	private WebElement niceLeader;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[10]/div[1]/select[1]/option[3]")
	private WebElement excColleage;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[10]/div[1]/select[1]/option[4]")
	private WebElement goodTeam;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[10]/div[1]/select[1]/option[5]")
	private WebElement chanceGoSite;
	
	
	public void fillFormAws(String fName, String lName, String dob, int gender,int expect, String alamat,
			String email, String password, String company, String comment) {
//		this.firstName.click();
		this.firstName.sendKeys(fName);
		this.lastName.sendKeys(lName);
		this.address.sendKeys(alamat);
		this.dob.sendKeys(dob);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.company.sendKeys(company);
		this.comment.sendKeys(comment);
		this.checkRad1.click();
		this.checkRad2.click();
		this.checkRad3.click();
		switch(gender) {
		case 1:
			this.genderMale.click();
			break;
		case 2:
			this.genderFemale.click();
			break;
		case 3:
			this.inBetween.click();
			break;
		default:
			this.inBetween.click();
		}
		
		switch(expect) {
		case 1:
			this.highSalary.click();
			break;
		case 2:
			this.niceLeader.click();
			break;
		case 3:
			this.excColleage.click();
		case 4:
			this.goodTeam.click();
			break;
		default:
			this.chanceGoSite.click();
		}
		this.submitBtn.click();
		
	}
	public String getSuccess() {
		return this.succestxt.getText();
	}
}
