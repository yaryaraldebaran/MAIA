package latihan.seleniumkedua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://demoqa.com/select-menu";
		driver.get(baseUrl);
		WebElement ngisiKota = driver.findElement(By.xpath("//div[contains(@class,'css-1gtu0rj-indicatorContainer')]//*[name()='svg']"));
		
	}

}
