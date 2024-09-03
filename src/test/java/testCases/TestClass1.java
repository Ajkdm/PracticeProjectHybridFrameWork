package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

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
		
		prop=new GetPropertiesFile();
		
		GoogleHomePage page=new GoogleHomePage(driver);
		
		driver.get(prop.getURL1());
		page.enterTextOnSearchField(prop.getSearchText());
		
	}
	
	
	
}
