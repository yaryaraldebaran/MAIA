package latihan.seleniumlatihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingPartialText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 // by starting text
//		 WebElement name = driver.findElement(By.cssSelector("node[attribute_name ^= ‘attribute_partial_value’]"));
		 //by ending text
//		 WebElement name = driver.findElement(By.cssSelector("input[id ^= 'last']"));
		 WebElement buuton = driver.findElement(By.cssSelector("input[id =&'%ame']"));
		 
		 buuton.sendKeys("Martojo");
		 driver.close();
	}

}
