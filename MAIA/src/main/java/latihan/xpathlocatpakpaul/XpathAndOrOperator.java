package latihan.xpathlocatpakpaul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAndOrOperator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);

		/*Operator AND*/
		 driver.findElement(By.xpath("//input[@class='form-control' and @id='last-name']")).sendKeys("Bambang");
		 //yang kepilih lastname
		 
		 /*Operator OR*/
		 driver.findElement(By.xpath("//input[@class='form-control' or @id='first-name']")).sendKeys("Bagas");
		 //kalo or hanya yang pertama
		 driver.close();
	}
}