package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestClass7 
{
	@BeforeMethod
	public void m5() 
	{
		driver =new ChromeDriver();
	}
	
	WebDriver driver;
	@Test()
	public void m1() 
	{
		driver.get("https://www.google.com/");
		//Assert.fail();
	}
	
	@Test()
	public void m2() 
	{
		
		driver.get("https://www.google.com/");
		//Assert.fail();
	}
	
	@Test()
	public void m3() 
	{
		driver.get("https://www.google.com/");
		//Assert.fail();
	}
	
	@Test()
	public void m4() 
	{
		driver.get("https://www.google.com/");
		System.out.println("HI");
	}
}