package pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class LoginPage extends TestBase{

	
	@Test(dataProvider = "LoginPage")
	public void doLogin(String username, String password) throws Exception {

		Thread.sleep(2000);
		type("email_xpath", username);
		Thread.sleep(2000);
		type("password_xpath", password);
		Thread.sleep(2000);
		click("loginButton_xpath");
		Thread.sleep(5000);

	}
	
	@DataProvider(name ="LoginPage")
	public Object[][] getData() throws Exception {

		return TestUtil.getData("FBLogin");
	}

}
