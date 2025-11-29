package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/Feature/AddToCart.feature"},
		dryRun = true,
		glue = "steps"
		,snippets = SnippetType.CAMELCASE
		,plugin = {"pretty","html:report/AddToCart/Addresult.html","json:report/AddToCart/Addresult.json","junit:report/AddToCart/Addresult.xml"}
		)

public class AddToCartRunner  extends AbstractTestNGCucumberTests{

}
