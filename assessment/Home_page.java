package assessment;

import org.openqa.selenium.By;

public class Home_page extends CommonMethods {
	public Home_page() {
		
	}
	public Home_page enterFilter()  {
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		return this;	
	}
	public Incident_page clickFilter() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='sn-widget-list-title'])[43]")).click();
		return new Incident_page();	
	}
	

}
