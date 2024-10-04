package testCases;

import org.testng.annotations.Test;

import pageObjects.GoogleHomePage;
import testBase.BaseClass;
import utilities.GetPropertiesFile;

public class TestClass1 extends BaseClass
{

	GetPropertiesFile prop;
	
	@Test
	public void testCase1() throws Exception 
	{
		//Properties prop=new Properties();
		//FileInputStream file=new FileInputStream("./src/test/resource/Properties.properties");
		
		//prop.load(file);
		
		//prop=new GetPropertiesFile();
		
		GoogleHomePage page=new GoogleHomePage(driver);
		logger.info("Launching URL...............");
		logger.debug("Debug Starts");
		driver.get("https://www.google.com/");
		logger.info("Entering Test on the search field...................");
		//page.enterTextOnSearchField(prop.getSearchText());
		
	}
	
	
	@Test
	public void testCase2() throws Exception 
	{
		//Properties prop=new Properties();
		//FileInputStream file=new FileInputStream("./src/test/resource/Properties.properties");
		
		//prop.load(file);
		
		logger.info("Launhing FB URL...................");
		logger.debug("Debug Starts");
		driver.get("https://www.facebook.com/");
		
		
	}

	@Test
	public void testCase3() throws Exception 
	{
		//Properties prop=new Properties();
		//FileInputStream file=new FileInputStream("./src/test/resource/Properties.properties");
		
		//prop.load(file);
		
		logger.info("Launhing FB URL...................");
		logger.debug("Debug Starts");
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@Test
	public void testCase4() throws Exception 
	{
		//Properties prop=new Properties();
		//FileInputStream file=new FileInputStream("./src/test/resource/Properties.properties");
		
		//prop.load(file);
		
		logger.info("Launhing Gmail URL...................");
		logger.debug("Debug Starts");
		driver.get("https://www.gmail.com/");
		
		
	}
	
	
	
}
