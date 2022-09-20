package latihan.cucumberr.ohrmoutline;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/hrms/01loginoutline.feature"},
glue = "latihan.cucumberr.ohrmoutline",
monochrome=true,
plugin = {"pretty","html:target/html/LoginRunnerOutline.html",
		"json:target/jsonreport/LoginRunnerOutline.json",
		"junit:target/junitreport/LoginRunnerOutline.xml"})
public class OHRMOutlineRunner extends AbstractTestNGCucumberTests{

}
