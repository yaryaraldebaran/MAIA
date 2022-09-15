package latihan.xpathlocatpakpaul;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPrecedingSiblingAxis {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);

		 List<WebElement> input = driver.findElements(By.xpath("//option[@value ='4']//preceding-sibling::option"));
	  		for (int i = 0; i<input.size();i++) {
				  System.out.println(input.get(i).getAttribute("value"));
			  }
			// untuk value 4 -> 0,1,2,3 minus dirinya snediri dan berhenti di dirinya sendiri
	  		// untuk value 2 -> 0,1 mnus dirinya sendiri dan berhenti di dirinya sendiri


		 System.out.println("================================================================");
		 System.out.println(driver.findElement(By.xpath("//option[@value ='4']//preceding-sibling::option[3]")).getAttribute("value"));
		 System.out.println("================================================================");
		 System.out.println(driver.findElement(By.xpath("//option[@value ='4']//preceding-sibling::option")).getAttribute("value"));
	}
}