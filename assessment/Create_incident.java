package assessment;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create_incident extends CommonMethods{
	@BeforeClass
	public void setData() {
		excelfilename="test";
	}
	@Test(dataProvider="fetchData")
	public void Incident(String name, String description) throws Exception {
		//Login
		Login_page login = new Login_page();
		login.enterUsername()
		.enterPassword()
		.clickSubmit()
		.enterFilter()
		.clickFilter()
		.getId()
		.enterName(name)
		.enterDescription(description)
		.clickSubmit()
		.enterNumber()
		.getNum();
		
		
		
		
	
		
	}
	
	

}
