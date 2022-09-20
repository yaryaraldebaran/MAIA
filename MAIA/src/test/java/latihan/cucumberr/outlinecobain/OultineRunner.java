package latihan.cucumberr.outlinecobain;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/outlinecobain.feature"},
glue = "latihan.cucumberr.outlinecobain",
monochrome=true,
plugin = {"pretty","html:target/html/LoginRunner.html",
		"json:target/jsonreport/LoginRunner.json",
		"junit:target/junitreport/LoginRunner.xml"})
public class OultineRunner extends AbstractTestNGCucumberTests {

}
