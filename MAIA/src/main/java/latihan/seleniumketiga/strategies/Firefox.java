package latihan.seleniumketiga.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox implements DriverStrategy{

	@Override
	public WebDriver setStrategy() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =  new FirefoxDriver();
		return driver;
	}
}
