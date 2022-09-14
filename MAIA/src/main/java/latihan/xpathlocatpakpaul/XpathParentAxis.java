package latihan.xpathlocatpakpaul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathParentAxis {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://demoqa.com/text-box";
		driver.get(baseUrl);

		
		System.out.println(driver.findElement(By.xpath("//input[@id ='userName']//parent::div")).getAttribute("id"));
		driver.close();
	}
}