package latihan.seleniumlatihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssLocatingByPlaceholder {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrl);

		WebElement name = driver.findElement(By.cssSelector("textarea[placeholder ='Current Address']"));
		name.sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
	}
}
