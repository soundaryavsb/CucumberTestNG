package webSiteHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance{
	
	@After
	public void AfterScenario(Scenario scenario)
	{
		boolean scenarioStatus=scenario.isFailed();
		if(scenarioStatus)
		{
			byte[] screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Web browser title not matched screenshot");
		}
		driver.quit();
	}
	
}
