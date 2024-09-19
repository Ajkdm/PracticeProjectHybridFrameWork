package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShotMethods
{
	WebDriver driver;
	public void screenShot() throws IOException 
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		File sourceFile=screen.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("./ScreenShots/Test.png");
		Files.copy(sourceFile, destinationFile);
	}
}
