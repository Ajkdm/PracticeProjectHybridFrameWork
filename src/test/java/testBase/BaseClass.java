package testBase;

import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass
{
	public WebDriver driver;
	public Logger logger;
	@BeforeClass
	public void setup() 
	{
		logger=LogManager.getLogger(this.getClass());
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterClass
	public void tearDown() 
	{
		//driver.quit();
	}
	
	public String randomStringUpperCase() 
	{
		String string1 = RandomStringUtils.randomAlphabetic(10).toUpperCase();
		return string1;
	}
	public String randomString() 
	{
		String string1 = RandomStringUtils.randomAlphabetic(10);
		return string1;
	}
	
	public String randomNumber() 
	{
		String number = RandomStringUtils.randomNumeric(10);
		return number;
	}
	
	public String  randomAlphaNumeric1() 
	{
		String alphaNumeric=RandomStringUtils.randomAlphanumeric(10);
		return alphaNumeric;
	}
	
	public String  randomAlphaNumeric2() 
	{
		String string = RandomStringUtils.randomAlphabetic(10);
		String number = RandomStringUtils.randomNumeric(10);
		return (string+number);
	}
}
