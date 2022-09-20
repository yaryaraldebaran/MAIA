package latihan.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;


public class AutocompletePage {
	private WebDriver driver;

	public AutocompletePage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "autocomplete")
	private WebElement address;
	@FindBy(id = "street_number")
	private WebElement StreetNumber;
	@FindBy(id = "route")
	private WebElement route;
	@FindBy(id = "locality")
	private WebElement locality;
	@FindBy(id="administrative_area_level_1")
	private WebElement administrativeAreaLevel1;
	@FindBy(id = "postal_code")
	private WebElement postalCode;
	@FindBy(id = "country")
	private WebElement country;
	
	public void manipulateAddress(String x) {
		address.click();
		address.clear();
		address.sendKeys(x);
	}
	public void manipulateStreetNumber(String street) {
		StreetNumber.click();
		StreetNumber.clear();
		StreetNumber.sendKeys(street);
	}
	public void manipulateRoute(String r) {
		route.click();
		route.clear();
		route.sendKeys(r);
	}
	public void manipulateLocality(String l) {
		locality.click();
		locality.clear();
		locality.sendKeys(l);
	}
	/*
	 * manipulasi field dari AAL: Administrative Area level 1
	 */
	public void manipulateAAL(String aaL) {
		administrativeAreaLevel1.click();
		administrativeAreaLevel1.clear();
		administrativeAreaLevel1.sendKeys(aaL);
	}
	public void manipulatePostalCode(String pc) {
		postalCode.click();
		postalCode.clear();
		postalCode.sendKeys(pc);
	}
	public void manipulateCountry(String c) {
		country.click();
		country.clear();
		country.sendKeys(c);
	}
//    driver.get("https://formy-project.herokuapp.com/autocomplete");
//    driver.findElement(By.id("autocomplete")).click();
//    driver.findElement(By.id("autocomplete")).clear();
//    driver.findElement(By.id("autocomplete")).sendKeys("Sukabumi");
//    driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
//    driver.findElement(By.id("locality")).click();
//    driver.findElement(By.id("autocomplete")).click();
//    driver.findElement(By.id("street_number")).clear();
//    driver.findElement(By.id("street_number")).sendKeys("Jl. Sukakura");
//    driver.findElement(By.id("route")).click();
//    driver.findElement(By.id("route")).clear();
//    driver.findElement(By.id("route")).sendKeys("Jl. Kibulanamu");
//    driver.findElement(By.id("locality")).click();
//    driver.findElement(By.id("locality")).clear();
//    driver.findElement(By.id("locality")).sendKeys("Kintayaru");
//    driver.findElement(By.id("administrative_area_level_1")).click();
//    driver.findElement(By.id("administrative_area_level_1")).clear();
//    driver.findElement(By.id("administrative_area_level_1")).sendKeys("Rutaji");
//    driver.findElement(By.id("postal_code")).click();
//    driver.findElement(By.id("postal_code")).clear();
//    driver.findElement(By.id("postal_code")).sendKeys("898789");
//    driver.findElement(By.id("country")).click();
//    driver.findElement(By.id("country")).clear();
//    driver.findElement(By.id("country")).sendKeys("Nigeria");
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Autocomplete'])[2]/following::div[1]")).click();
}
