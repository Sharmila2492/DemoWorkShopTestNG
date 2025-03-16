package base;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.utility;

public class ProjectSpecificationMethods extends utility {
	@Parameters({"url","browser"})// here parameters are used for cross browser test
	@BeforeMethod
	public void LaunchAndLoadingBrowser(String url, String browser)
	{
		Browser(url,browser);
	}
	
	public void CloseBowser()
	{
		closeBrowser();
	}
	
	@DataProvider(name="readData")//it is used for test the same test method multiple times with different data inputs
	
	public  String[][] readData() throws IOException
	{
		String[][] Data=ReadExcel(SheetName);
		return Data;
	}

}
