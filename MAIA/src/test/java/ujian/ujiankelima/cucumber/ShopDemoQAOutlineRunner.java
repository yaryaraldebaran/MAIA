package ujian.ujiankelima.cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/shopdemoqa/01register.feature",
		"src/test/resources/features/shopdemoqa/02comment.feature"},
glue = "ujian.ujiankelima.cucumber",
monochrome=true,
plugin = {"pretty","html:target/html/ShopDemoQAOutlineRunner.html",
		"json:target/jsonreport/ShopDemoQAOutlineRunner.json",
		"junit:target/junitreport/ShopDemoQAOutlineRunner.xml"})
public class ShopDemoQAOutlineRunner extends AbstractTestNGCucumberTests{

}
