package latihan.seleniumlatihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManyOneCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);
		 WebElement name = driver.findElement(By.cssSelector("textarea[rows = '5'][cols='20'][class='form-control']"));
		 name.sendKeys("Jalan Rusak no 145 Kelurahan Monarki Kota Jakarta");
		 driver.close();
	}

}
