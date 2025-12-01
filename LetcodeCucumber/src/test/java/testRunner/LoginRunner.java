package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/Feature/login.feature"},
		dryRun = true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
