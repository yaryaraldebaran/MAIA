package latihan.cucumberr.outlinecobain;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constant.Constants;
import latihan.cucumber.framework.scenariotest.hrms.HRMScene;
import latihan.cucumber.framework.utils.Utils;

public class OutlineHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/hrms/extentreport/hrms-scene-login-xr.html");

	@Before
	public void setUp() {
		System.out.println("ini before");
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		System.out.println("ini afterstep");
	}
}
