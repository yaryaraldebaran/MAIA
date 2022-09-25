package ujian.ujiankelima.selenium.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constant.Constants;
import latihan.cucumber.framework.utils.Utils;

public class DemoQAShopHome {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	public DemoQAShopHome() {
		
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//component saat login
	@FindBy(xpath ="/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement homeBtn;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement loginBtn;
	@FindBy(id ="rememberme")
	private WebElement rememberMeCheck;
	@FindBy(linkText = "Dismiss")
	private WebElement dismissAwalBtn;
	@FindBy(xpath="//a[normalize-space()='The New Marc Jacobs Gotham Saddle Bag']")
	private WebElement marcJacobBtn;
	@FindBy(xpath = "//input[@id='submit']")
	private WebElement submitCommentBtn;
	
	//component utama setelah login
	@FindBy(linkText = "My Wishlist")
	private WebElement myWishlistBtn;
	@FindBy(linkText = "My Account")
	private WebElement myAccountBtn;
	@FindBy(linkText = "Log out")
	private WebElement logOutBtn;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/i[1]")
	private WebElement cartBtn;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
	private WebElement cartBtnAft;
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	private WebElement checkoutBtn;
	// component wishlist
	@FindBy(xpath = "//a[@data-title='Add to Wishlist' and @data-product-id='1491']")
	private WebElement wishPlayboy;
	@FindBy(xpath = "//a[@data-title='Add to Wishlist' and @data-product-id='1485']")
	private WebElement wishBlack;
	@FindBy(css =  "tr[id='yith-wcwl-row-1497'] a[title='Remove this product']")
	private WebElement removeWishPinkDrop;
	@FindBy(css =  "tr[id='yith-wcwl-row-1491'] a[title='Remove this product']")
	private WebElement removeWishPlayboy;
	@FindBy(css =  "tr[id='yith-wcwl-row-1485'] a[title='Remove this product']")
	private WebElement removeWishBlack;
	
	//component checkout
	@FindBy(id ="billing_first_name")
	private WebElement bilFirstName;
	@FindBy(id= "billing_last_name")
	private WebElement bilLastName;
	@FindBy(id= "billing_company")
	private WebElement billCompany;
	@FindBy(id="select2-billing_country-container")
	private WebElement billPilihCountry;
	@FindBy(xpath ="//input[@role='combobox']")
	private WebElement billCountry;
	@FindBy(id ="select2-billing_state-container")
	private WebElement pilihProvinsi;
	@FindBy(id = "billing_address_1")
	private WebElement billAddress1;
	@FindBy(id = "billing_city")
	private WebElement billCity;
	@FindBy(className = "select2-search__field")
	private WebElement billProvince;
	@FindBy(id="billing_postcode")
	private WebElement billPostcode;
	@FindBy(id ="billing_phone")
	private WebElement billPhone;
	@FindBy(id = "billing_email")
	private WebElement billEmail;
	@FindBy(id="order_comments")
	private WebElement orderComments;
	@FindBy(id="place_order")
	private WebElement placeOrderBtn;
	@FindBy(xpath ="//input[@id='terms']")
	private WebElement billTerms;

	
	//component product
	@FindBy(linkText = "playboy x missguided plus size grey lips print front cropped t shirt")
	private WebElement playboyBtn;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/h3[1]/a[1]")
	private WebElement blackLuxGraphBtn;
	@FindBy(xpath = "//div[@id='product-1485']/div/div[2]/form/div/div[2]/button")
	private WebElement blackLuxCart;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/button[2]")
	private WebElement addOneQuantity;
	
	//component cart
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	private WebElement updateCart;
	
	
	//component pilihan di product
	@FindBy(id = "pa_color")
	private WebElement colorOption;
	@FindBy(id = "pa_size")
	private WebElement sizeOption;
	private Select selectBlack;
	private Select select32;
	
	//component validator
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement addedToCart;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/input[1]")
	private WebElement quantityTotal;
	@FindBy(className = "woocommerce-thankyou-order-received")
	private WebElement ordered;
	@FindBy(xpath = "//td[@class='wishlist-empty']")
	private WebElement wishlistEmpty;
	@FindBy(xpath="//strong[normalize-space()='ERROR']")
	private WebElement loginFail;
	
	//scenario1
	public void login(String username, String password) {
		this.myAccountBtn.click();
		this.username.sendKeys(username); //step
		this.password.sendKeys(password);
		clickBtnLogin();
	}
	
	//scenario2
	public void addProdToCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		blackLuxGraphBtn.click();
		this.selectBlack = new Select(colorOption);
		this.selectBlack.selectByVisibleText("Black");
		this.select32 = new Select(sizeOption);
		this.select32.selectByVisibleText("32");
		Utils.delay(3, strDelay);
		this.blackLuxCart.click();
		Utils.delay(3, strDelay);
	}
	
	//scenario3
	public void addBlackLuxQuantity(int quantity) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		blackLuxGraphBtn.click();
		this.selectBlack = new Select(colorOption);
		this.selectBlack.selectByVisibleText("Black");
		this.select32 = new Select(sizeOption);
		this.select32.selectByVisibleText("32");
		Utils.delay(3, strDelay);
		this.blackLuxCart.click();
		Utils.delay(3, strDelay);
		this.cartBtnAft.click();
		for(int i =0; i<quantity;i++) {
			this.addOneQuantity.click();
		}
		this.updateCart.click();
		System.out.println("jumlah total "+quantityTotal.getText());
		
	}
	//scenario4 
	public void addAndEmptyWishlist() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		Utils.delay(5, strDelay);
		this.wishBlack.click();
		Utils.delay(3, strDelay);
		this.wishPlayboy.click();
		Utils.delay(3, strDelay);
		this.myWishlistBtn.click();
		Utils.delay(3, strDelay);
		//remove products
		js.executeScript("window.scrollBy(0,500)", "");
		this.removeWishBlack.click();
		Utils.delay(3, strDelay);
		this.removeWishPlayboy.click();
		Utils.delay(3, strDelay);
	}
	//scenario5
	public void checkOutForm() throws  AWTException {
		Robot rbt = new Robot();
		addBlackLuxQuantity(3);
		checkoutBtn.click();
		this.bilFirstName.sendKeys("Mukidi");
		this.bilLastName.sendKeys("Madili");
		this.billCompany.sendKeys("Kumpeni");
		this.billPilihCountry.click();
		this.billCountry.sendKeys("Indonesia");
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		////////////////////////////
		this.pilihProvinsi.click();
		this.billProvince.sendKeys("Jawa Barat");
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		///////////////////////////
		this.billAddress1.sendKeys("Jl Kahiripan no 89");
		this.billCity.sendKeys("Bandung");
		this.billPostcode.sendKeys("43533");
		this.billPhone.sendKeys("0812321312");
		this.billEmail.sendKeys("mukidi@gmail.com");
		Utils.delay(3, strDelay);
		this.billTerms.click();
		Utils.delay(3, strDelay);
		this.placeOrderBtn.click();
		Utils.delay(3, strDelay);
	}
	
	//repeatable action method
	public void clickBtnLogin() {
		this.loginBtn.click();
	}
	public void homeBtnClick() {
		homeBtn.click();
	}
	public void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
	
	//getter element method
	public void clickDismiss() {
		this.dismissAwalBtn.click();
	}
	public String getTxtAddedCart() {
		return addedToCart.getText().toString();
	}
	public String getQuantityFinal() {
		return this.quantityTotal.getAttribute("value").toString();
	}
	public String getValidOrder() {
		return this.ordered.getText();
	}
	public String getWishlistEmpty() {
		return wishlistEmpty.getText().toString();
	}
	public String getLoginError() {
		return loginFail.getText().toString();
	}
}
