package gmailTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.base;

public class ValidateLoginTest extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
    public void LoginToGmail(){
		
		PageFactory.initElements(driver, LoginPage.class);
		String strUsername = prop.getProperty("username");
		String strPassword = prop.getProperty("password");
		LoginPage loginvalidate = new LoginPage(driver);
			
	    loginvalidate.setUserName(strUsername);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    loginvalidate.clickOnNext();
	    loginvalidate.setPassword(strPassword);
	    loginvalidate.clickOnNext();
	    loginvalidate.ValidateUserGmailLogin();
                
     }
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		
	}

	

	
}

