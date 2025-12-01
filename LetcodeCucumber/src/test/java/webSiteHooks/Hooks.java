package webSiteHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance{

	@Before
	public void BrowserLaunch(Scenario scenario)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.manage().window().maximize();
		//Returns unique ID
		System.out.println("==Scenario Before getId: "+scenario.getId());
		//Get the feature file location
		System.out.println("==Scenario Before getUri: "+scenario.getUri());
		//Get the line number in the feature file
		System.out.println("==Scenario Before getLine: "+scenario.getLine());
		//Get Scenario Name or Scenario Outline Name
		System.out.println("==Scenario Before getName: "+scenario.getName());
		//Get the current Class name
		System.out.println("==Scenario Before getClass: "+scenario.getClass());
		//Get tags applied to the scenario..
		System.out.println("==Scenario Before getSourceTagName: "+scenario.getSourceTagNames());
		//Get the Status of the line --> Pass/fail/undefined
		System.out.println("==Scenario Before geStatus: "+scenario.getStatus());
	}

	@After(value="@CleanUp", order=0)
	public void DataCleanUp(Scenario scenario)
	{
		
		scenario.log("This is clean up in @After");
	}

	@After(order=1)
	public void AfterScenario(Scenario scenario)
	{
		System.out.println("==Scenario After getId: "+scenario.getId());
		System.out.println("==Scenario After getUri: "+scenario.getUri());
		System.out.println("==Scenario After getLine: "+scenario.getLine());
		System.out.println("==Scenario After getName: "+scenario.getName());
		System.out.println("==Scenario After getClass: "+scenario.getClass());
		System.out.println("==Scenario After getSourceTagName: "+scenario.getSourceTagNames());
		System.out.println("==Scenario After geStatus: "+scenario.getStatus());
		scenario.log("This is normal @After");
		boolean scenarioStatus=scenario.isFailed();
		if(scenarioStatus)
		{
			byte[] screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Web browser title not matched screenshot");
		}
		driver.quit();
	}

}
