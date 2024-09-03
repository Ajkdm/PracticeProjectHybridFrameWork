package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesFile 
{
	public Properties prop;
	public void getPropertiesFile() 
	{
		try 
		{
			FileInputStream file=new FileInputStream("./src//test//resource//Properties.properties");
			prop=new Properties();
			try
			{
				prop.load(file);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getURL1() 
	{
		getPropertiesFile();
		String url=prop.getProperty("url1");
		return url;
	}
	
	public String getSearchText() 
	{
		String searchText=prop.getProperty("searchData1");
		return searchText;
	}
}
