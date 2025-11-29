package fullCodeWrite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WebSiteTitleMatching {
	WebDriver driver;
	@BeforeSuite
	public void InitialSetup()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chrome Driver\\chromedriver-win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	}
	@Test
	public void checkingGoogleTitle()
	{
		driver.get("https://www.google.com/");
		String TitleName=driver.getTitle();
		if(TitleName.equals("Google"))
		{
			System.out.println("Yes, Google title is matched");
		}
		else
		{
			System.out.println("No, Google title is not matched");
		}
	}
	@Test
	public void checkingBingTitle()
	{
	driver.get("https://www.bing.com");
	String TitleName=driver.getTitle();
	if(TitleName.equals("Search - Microsoft Bing Fail"))
	{
		System.out.println("Yes, Bing title is matched");
	}
	else
	{
		System.out.println("No, Bing title is not matched");
	}
	}
	@AfterSuite
	public void EndSetup()
	{
	driver.quit();
	}
}
