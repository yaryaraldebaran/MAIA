package latihan.seleniumlatihan;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFormy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Random rnd = new Random();
		
//		data input using random generator 
		String levelEduOp = "radio-button-".concat(Integer.toString(rnd.nextInt(1,4)));
		String sexOp = "checkbox-".concat(Integer.toString(rnd.nextInt(1,4)));
		String YearsOfExpOp = Integer.toString(rnd.nextInt(1,5));
		String dateOp = Integer.toString(rnd.nextInt(1,26)).concat("/").concat(Integer.toString(rnd.nextInt(1,13))).concat("/").concat(Integer.toString(rnd.nextInt(1970,2022)));
		
		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 WebElement formFirstName = driver.findElement(By.id("first-name"));
		 WebElement lastName = driver.findElement(By.id("last-name"));
		 WebElement JobTitle = driver.findElement(By.id("job-title"));
		 WebElement levelEd = driver.findElement(By.id(levelEduOp));
		 WebElement sex = driver.findElement(By.id(sexOp));
		 Select yearsExperience = new Select(driver.findElement(By.id("select-menu")));
		 WebElement DateForm = driver.findElement(By.id("datepicker"));
//		 WebElement submitBtn = driver.findElement(By.partialLinkText("Submit")); // other option
		 WebElement submitBtn = driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']"));
		 
		 formFirstName.sendKeys("Sutarno");
		 lastName.sendKeys("Jukiman");
		 JobTitle.sendKeys("Beternak platipus");
		 levelEd.click();
		 sex.click();
		 yearsExperience.selectByValue(YearsOfExpOp);
		 DateForm.sendKeys(dateOp);
		 DateForm.sendKeys(Keys.ENTER);
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 submitBtn.click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
	}

}
