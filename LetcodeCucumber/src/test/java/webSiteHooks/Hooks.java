package webSiteHooks;

import driver.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance{
	
	@After
	public void AfterScenario(Scenario scenario)
	{
		driver.quit();
	}
	
}
