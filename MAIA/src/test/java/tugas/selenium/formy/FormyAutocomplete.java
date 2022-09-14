package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FormyAutocomplete {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFormyAutocomplete() throws Exception {
    driver.get("https://formy-project.herokuapp.com/autocomplete");
    driver.findElement(By.id("autocomplete")).click();
    driver.findElement(By.id("autocomplete")).clear();
    driver.findElement(By.id("autocomplete")).sendKeys("Sukabumi");
    driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("locality")).click();
    driver.findElement(By.id("autocomplete")).click();
    driver.findElement(By.id("street_number")).clear();
    driver.findElement(By.id("street_number")).sendKeys("Jl. Sukakura");
    driver.findElement(By.id("route")).click();
    driver.findElement(By.id("route")).clear();
    driver.findElement(By.id("route")).sendKeys("Jl. Kibulanamu");
    driver.findElement(By.id("locality")).click();
    driver.findElement(By.id("locality")).clear();
    driver.findElement(By.id("locality")).sendKeys("Kintayaru");
    driver.findElement(By.id("administrative_area_level_1")).click();
    driver.findElement(By.id("administrative_area_level_1")).clear();
    driver.findElement(By.id("administrative_area_level_1")).sendKeys("Rutaji");
    driver.findElement(By.id("postal_code")).click();
    driver.findElement(By.id("postal_code")).clear();
    driver.findElement(By.id("postal_code")).sendKeys("898789");
    driver.findElement(By.id("country")).click();
    driver.findElement(By.id("country")).clear();
    driver.findElement(By.id("country")).sendKeys("Nigeria");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Autocomplete'])[2]/following::div[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
