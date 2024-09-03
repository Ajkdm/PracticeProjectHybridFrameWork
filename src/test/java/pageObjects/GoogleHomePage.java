package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BaseConstructor
{
	public GoogleHomePage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(id="APjFqb")
	WebElement googleSearch;
	
	public void enterTextOnSearchField(String string) 
	{
		googleSearch.sendKeys(string);
		//googleSearch.sendKeys(Keys.ENTER);
	}
	
	
}
