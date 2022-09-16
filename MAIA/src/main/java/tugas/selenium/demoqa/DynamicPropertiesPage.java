package tugas.selenium.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicPropertiesPage {
	private WebDriver driver;
	@FindBy(id = "enableAfter")
	private WebElement enableAfter;
	@FindBy(id = "colorChange")
	private WebElement colorChange;
	@FindBy(id = "visibleAfter")
	private WebElement visibleAfter;
	public DynamicPropertiesPage() throws InterruptedException {
		Thread.sleep(5500);
		enableAfter.click();
		Thread.sleep(1000);
		colorChange.click();
		visibleAfter.click();
	}
	/*
	 * id enableAfter click
	 * id colorChange click
	 * id visibleAfter
	 */
}
