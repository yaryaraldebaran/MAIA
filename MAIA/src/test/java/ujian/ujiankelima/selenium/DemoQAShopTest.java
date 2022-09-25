package ujian.ujiankelima.selenium;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constant.Constants;
import latihan.cucumber.framework.utils.Utils;
import ujian.ujiankelima.selenium.page.DemoQAShopHome;

public class DemoQAShopTest {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	public static WebDriver driver;
	private DemoQAShopHome dmQA;
	@BeforeMethod
	public void pageObject() {
		//alur pertama pasti sngleton.getinstance
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLSHOPDEMOQA);
		dmQA = new DemoQAShopHome();
		dmQA.clickDismiss();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	
	@Test
	public void shopDemoQALogin() {
		dmQA.login("jukardi", "shaa1233");
		assertTrue(dmQA.getLoginError().contains("ERROR"));
		
	}
	@Test
	public void addProductToCart() {
		dmQA.addProdToCart();
		assertTrue(dmQA.getTxtAddedCart().contains("added"));
	}
	@Test
	public void addQuantityBlack()  {
		int qntyInput = 5;
		dmQA.addBlackLuxQuantity(qntyInput);
		assertEquals(dmQA.getQuantityFinal(),String.valueOf(qntyInput+1));
	}
	@Test
	public void checkoutShop() throws AWTException {
		dmQA.checkOutForm();
		Utils.delay(4, strDelay);
		assertTrue(dmQA.getValidOrder().contains("received"));
	}
	@Test
	public void tambahWIshLiSTest() throws InterruptedException {
		dmQA.addAndEmptyWishlist();
		assertTrue(dmQA.getWishlistEmpty().contains("NO PRODUCTS"));
	}
}
