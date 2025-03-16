package utils;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class utility {
	
	public static WebDriver driver;
	public String SheetName;
	public static Properties prop;
	public void Browser(String url,String browser)
	{
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}else
		{
			driver=new ChromeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	}
	public void closeBrowser()
	{
		driver.close();
	}

	 
	public static String[][] ReadExcel(String SheetName) throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook("D:\\JavaWorkspace\\TestNg.ExtentReport\\src\\test\\resources\\data\\Login.xlsx");
		XSSFSheet sheet=book.getSheet(SheetName);
		int rowCount=sheet.getLastRowNum();
		int columnCount=sheet.getRow(0).getLastCellNum();
		
		String[][] Data= new String[rowCount][columnCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<=columnCount;j++)
			{
				XSSFCell Cell=row.getCell(j);
				System.out.println(Cell.getStringCellValue());
				Data[i-1][j]=Cell.getStringCellValue();
			}
		}
		book.close();
		return Data;
	}
	
	/*public static void readFromPropFile(String filepath) throws IOException
	{
		FileReader file=new FileReader(filepath);//read the data from the file
		prop =new Properties();// maintain all the properties in a particular file
		prop.load(file);// store all the data into the file
		
		
	}*/
}
