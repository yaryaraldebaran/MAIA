package latihan.seleniumlatihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathRelatif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);

		 WebElement name = driver.findElement(By.cssSelector("textarea.form-control"));
		 name.sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
	}

}
