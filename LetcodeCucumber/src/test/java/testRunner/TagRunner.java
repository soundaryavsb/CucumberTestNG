package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/Feature"}
		,dryRun = true
		,glue = "steps"
		,snippets = SnippetType.CAMELCASE
		,plugin = {"pretty","html:report/tags/TagsReuslt.html","json:report/tags/TagsReuslt.json","junit:report/tags/TagsReuslt.xml"}
		,tags = "@Reg"
//		,tags = "@Sanity or @Retest"
//		,tags = "@Reg and @Dev"
//		,tags = "not @Reg"
		)
public class TagRunner extends AbstractTestNGCucumberTests{

}
