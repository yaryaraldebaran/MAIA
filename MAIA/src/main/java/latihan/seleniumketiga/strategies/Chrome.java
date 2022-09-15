package latihan.seleniumketiga.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome implements DriverStrategy{
	

	@Override
	public WebDriver setStrategy() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		return driver;
	}
	
}
