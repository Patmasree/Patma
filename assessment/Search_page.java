package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Search_page extends CommonMethods {
	public Search_page() {
		
	}
	public Search_page enterNumber()   {
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(text+Keys.ENTER);
		return this;

	}
	public Search_page getNum() throws InterruptedException {
		Thread.sleep(2000);
		 String id1= driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
			 System.out.println("Get Id:" +id1);
	if(text.equals(id1)) {
			System.out.println(" Id Verfied");
		}
		else {
			System.out.println("Id not verified");
		}
	return this;	
	}
	
		
	}
	

