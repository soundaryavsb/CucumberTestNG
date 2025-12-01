package steps;

import org.testng.Assert;

import base.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebSiteTitleCheckSteps extends DriverInstance{
	String TitleName;
	
//	@Given("Launching the browser")
//	public void launching_the_browser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
//		driver=new ChromeDriver();    
//	}

	@Given("Navigate to the Google website")
	public void navigate_to_the_google_website() {
		driver.get("https://www.google.com/");
	}

	@When("Get the Google browser Title")
	public void get_the_google_browser_title() {
		TitleName=driver.getTitle();
	}

	@Then("Matching the Google Title and Get the result")
	public void matching_the_google_title_and_get_the_result()  {

		if(TitleName.equals("Google"))
		{
			System.out.println("Yes, Google title is matched and the title is "+"\'"+TitleName+"\'");
		}
		else
		{
			System.out.println("No, Google title is not matched and the title is "+"\'"+TitleName+"\'");
		}
	}

	@Given("Navigate to the Bing website")
	public void navigate_to_the_bing_website() {
		driver.get("https://www.bing.com");
	}

	@When("Get the Bing browser Title")
	public void get_the_bing_browser_title() {
		TitleName=driver.getTitle();
	}
	@Then("Matching the Bing Title and Get the result")
	public void matching_the_bing_title_and_get_the_result() {
		Assert.assertEquals(TitleName.equals("Search - Microsoft Bing Fail"), true);

	}
}
