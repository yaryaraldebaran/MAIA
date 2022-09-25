package latihan.seleniumlat;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CekJudul {
	WebDriver driver;
	String baseUrl = "https://shop.demoqa.com/";
	@BeforeMethod
	public void befMeth() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.linkText("Dismiss")).click();
	}
	@Test
	public void cekGoogle() {
	    driver.findElement(By.linkText("My Wishlist")).click();
	    driver.findElement(By.linkText("My Account")).click();
	}

}
