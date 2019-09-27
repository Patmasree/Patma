package assessment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import assessment.utils.DataLibrary;

public class CommonMethods {
	public String excelfilename;
	public String text="";
	public static ChromeDriver driver;
	@BeforeMethod
	public void StartApp() 
	//public static void main(String args[]) {
		
	
 {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver1.exe");
	driver = new ChromeDriver();
	driver.get("https://dev77567.service-now.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@AfterMethod
	public void CloseApp() {
		 driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][]datacenter() throws IOException{
		String[][] data= DataLibrary.readExcel(excelfilename);
		return data;
		
	}
}
	
