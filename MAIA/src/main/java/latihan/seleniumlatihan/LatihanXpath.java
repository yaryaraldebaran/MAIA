package latihan.seleniumlatihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LatihanXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 WebElement form = driver.findElement(By.xpath("/html/body/div/form/div/div/input"));
		 form.sendKeys("sadasl");
		 driver.close();
	}

}
