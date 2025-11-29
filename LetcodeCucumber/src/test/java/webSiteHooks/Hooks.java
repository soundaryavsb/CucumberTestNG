package webSiteHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance{
	
	@Before
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.manage().window().maximize();
		
	}
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
