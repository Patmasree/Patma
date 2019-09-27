package assessment;

import org.openqa.selenium.By;

public class Incident_page extends CommonMethods {
	public Incident_page() {
		
	}
	public Incident_page getId() throws InterruptedException  {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		 text = driver.findElement(By.xpath("//div//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Generated id:" +text); 
		return this;	
	}
	public Incident_page enterName(String name) throws InterruptedException {
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys(name);
		return this;	
	}
	public Incident_page enterDescription(String description)  {
		 driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys(description); 
		return this;	
	}
	public Search_page clickSubmit() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default'][1]")).click();
		return new Search_page();
		
	}

}
