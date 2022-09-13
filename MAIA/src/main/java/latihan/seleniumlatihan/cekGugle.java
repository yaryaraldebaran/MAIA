package latihan.seleniumlatihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class cekGugle {
	public static void main(String args[]){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		WebElement formSearch = driver.findElement(By.name("q"));
		formSearch.sendKeys("Sutarji");
		
		WebElement buttonSearch = driver.findElement(By.name("btnK"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buttonSearch.click();
		driver.close();
	}
}
