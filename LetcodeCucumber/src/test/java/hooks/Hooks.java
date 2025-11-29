package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void BeforeScenario(Scenario scenario)
	{
		System.out.println("Before Scenario --> "+scenario.getName());
	}
	@After
	public void AfterScenario(Scenario scenario)
	{
		System.out.println("After Scenario --> "+scenario.isFailed());
	}
	@BeforeStep
	public void BeforeStep(Scenario scenario)
	{
		scenario.log("Step Started");
	}
	@AfterStep
	public void AfterStep(Scenario scenario)
	{
		scenario.log("Step Ended");
	}
}
