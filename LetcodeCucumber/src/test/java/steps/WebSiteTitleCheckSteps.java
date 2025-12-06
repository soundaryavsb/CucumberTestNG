package steps;

import org.testng.Assert;

import base.PageContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebSiteTitleCheckSteps{
	private PageContext context;
	public WebSiteTitleCheckSteps(PageContext context) {
		this.context=context;
	}
	String TitleName;
	
	@Given("Navigate to the Google website")
	public void navigate_to_the_google_website() {
		context.getDriver().get("https://www.google.com/");
	}

	@When("Get the Google browser Title")
	public void get_the_google_browser_title() {
		TitleName=context.getDriver().getTitle();
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
		context.getDriver().get("https://www.bing.com");
	}

	@When("Get the Bing browser Title")
	public void get_the_bing_browser_title() {
		TitleName=context.getDriver().getTitle();
	}
	@Then("Matching the Bing Title and Get the result")
	public void matching_the_bing_title_and_get_the_result() {
		Assert.assertEquals(TitleName.equals("Search - Microsoft Bing Fail"), true);

	}
}
