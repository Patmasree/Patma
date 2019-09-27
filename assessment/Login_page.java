package assessment;

public class Login_page extends CommonMethods {
	
	
    public Login_page enterUsername() {
    	driver.switchTo().frame(0);
    	driver.findElementByXPath("//input[@name='user_name']").sendKeys("admin");
		return this; 	
    }
    public Login_page enterPassword() {
    	driver.findElementByXPath("//input[@name='user_password']").sendKeys("India@123");
		return this;	
    }
    public Home_page clickSubmit() {
    	driver.findElementByXPath("//button[@name='not_important']").click();
		return new Home_page();	
    }
}
