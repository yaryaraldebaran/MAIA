package latihan.seleniumlat;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CekJudul {
	@Test
	public void cekGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEXSOFT\\Documents\\lmsJuaraKoding\\selenium-tut\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "http://google.com";
		 String expectedTitle = "Google";
		 driver.get(baseUrl);
		 String actualTitle = driver.getTitle();
		 assertEquals(actualTitle, expectedTitle);
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
	}
}
