package tugas.selenium.demoqa;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constant.Constants;


public class PracticeFormPageTest {
	public static WebDriver driver;
	private PracticeFormPage prf;
	@BeforeMethod
	public void pageObject() {
		//alur pertama pasti sngleton.getinstance
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLPRACTICEFORM);
		prf = new PracticeFormPage();	
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	@Test
	public void testPracticeForm() throws InterruptedException, AWTException {
		try {
			// ganti direktori file gambar disini
			String directoryFile = "C:\\Users\\NEXSOFT\\Pictures\\BubbleSort1.png";
			String current = System.getProperty("user.dir");
			String directoryDua = current.concat("\\Data\\BubbleSort.png");
			prf.isiForm("Jukidi","Murod","mukidimurod@hayo.com",
					"Pria","0812312318","21 Desember 1998",
					"Math",2,directoryDua,"Jl. Kasuari no 34","Ya gitu hehe" );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(5000);
		assertTrue(prf.getTxtDoneUpload().contains("Thanks"));
	}
}
