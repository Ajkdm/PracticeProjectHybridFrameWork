package testCases;

import org.testng.annotations.Test;

public class TestClass2 
{
	@Test
	public void m1() 
	{
		int n=5;
		for(int i=0;i<n;i++) 
		{
			for(int j=i;j<n;j++) 
			{
				System.out.print("+");
			}
			
			for(int j=0;j<=i;j++) 
			{
				System.out.print("-");
			}
			System.out.println();
		}
	}

}
