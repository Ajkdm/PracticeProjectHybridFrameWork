package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer 
{
int maxTry=3;
int count=1;
	@Override
	public boolean retry(ITestResult result)
	{
		if(!result.isSuccess()) 
		{
			if(count<=maxTry) 
			{
				count++;
				return true;
			}
		}
		return false;
	}

}
