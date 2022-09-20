package latihan.cucumberr.loginrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/hrms/01login.feature"},
glue = "latihan.cucumberr.loginrunner",
monochrome=true,
plugin = {"pretty","html:target/html/LoginRunner.html",
		"json:target/jsonreport/LoginRunner.json",
		"junit:target/junitreport/LoginRunner.xml"})

public class LoginRunner extends AbstractTestNGCucumberTests{
}
