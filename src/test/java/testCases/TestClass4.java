package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TestClass4 extends BaseClass
{
	@Test
	public void m1() 
	{
		//driver=new ChromeDriver();
		//driver.get("https://www.youtube.com/");
		
		String str1 = "Hello";
		System.out.println(str1.hashCode());
		String str2 = str1 + " World";
		System.out.println(str2.hashCode());
		StringBuilder str=new StringBuilder("Hello");
		System.out.println(str.hashCode());
		str.append("World");
		System.out.println(str.hashCode());
	}
}
