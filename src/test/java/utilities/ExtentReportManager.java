package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context)
	{
		sparkReporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("");
		sparkReporter.config().setReportName("FunctionalTesting");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("TestName","Ajay");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.log(Status.PASS, result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Failed test case is: "+result.getName());
		test.log(Status.FAIL, "Test Case failed because: "+result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Skipped test case is: " +result.getName());

	}

	@Override
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
	
}
