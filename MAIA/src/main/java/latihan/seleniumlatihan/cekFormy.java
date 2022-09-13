package latihan.seleniumlatihan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class cekFormy {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 WebElement formFirstName = driver.findElement(By.id("first-name"));
		 WebElement lastName = driver.findElement(By.id("last-name"));
		 WebElement JobTitle = driver.findElement(By.id("job-title"));
		 WebElement levelEd = driver.findElement(By.id("radio-button-2"));
		 WebElement sex = driver.findElement(By.id("checkbox-1"));
		 Select yearsExperience = new Select(driver.findElement(By.id("select-menu")));
		 WebElement DateForm = driver.findElement(By.id("datepicker"));
		 WebElement submitBtn = driver.findElement(By.tagName("a"));
		 
		 formFirstName.sendKeys("Sutarno");
		 lastName.sendKeys("Jukiman");
		 JobTitle.sendKeys("Beternak platipus");
		 levelEd.click();
		 sex.click();
		 yearsExperience.selectByValue("1");
		 DateForm.sendKeys("09/09/2020");
		 DateForm.sendKeys(Keys.ENTER);
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 submitBtn.click();
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
		 
	}
}
