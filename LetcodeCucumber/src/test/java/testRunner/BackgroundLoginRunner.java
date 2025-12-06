package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/Feature/BackgroundLogin.feature"}
		,dryRun = false
		,glue="pages"
		,snippets = SnippetType.CAMELCASE
		,plugin = {"pretty","html:report/Background/Blogin.html","json:report/Background/Blogin.json","junit:report/Background/Blogin.xml"}
		)
public class BackgroundLoginRunner extends AbstractTestNGCucumberTests{

}
