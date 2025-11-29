package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		features = {"src/test/java/Feature"}
		,glue={"steps","hooks"}
		,dryRun = false
		,snippets = SnippetType.CAMELCASE
		,plugin = {"pretty","html:report/hooks/hooks.html","json:report/hooks/hooks.json","junit:report/hooks/hooks.xml"}
		)
public class HooksRunner extends AbstractTestNGCucumberTests{
	
}
