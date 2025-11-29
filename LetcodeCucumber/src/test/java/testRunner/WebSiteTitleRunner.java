package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/Feature/WebSiteTitleCheck.feature"}
		,dryRun = false
		,glue = {"steps","webSiteHooks"}
		,snippets = SnippetType.CAMELCASE
//		,tags = "@Sanity"
//		,tags = "@E2E"
		,tags = "@Sanity and @Reg"
		)

public class WebSiteTitleRunner extends AbstractTestNGCucumberTests{

	
}
