package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Logout_Page;
import org.testing.Pages.VideoPlay_Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Final_TC4 extends Base{
	

	@BeforeMethod
	public void TestCase_TC1_Login() throws Exception {
		Login_Page login = new Login_Page(driver, pr); // add here driver and pr
		login.sign_in("username", "password");
		Thread.sleep(7000);
	}
	
	@Test(priority = 4)
	public void videoplay_and_Like() throws Exception {
		System.out.println(" Video play and Like - Started");
		VideoPlay_Page videopage = new VideoPlay_Page(driver, pr);
		videopage.Click_Video_play();
		Thread.sleep(2000);
		videopage.Click_on_Like_icon();
		System.out.println("Video play and Like - Completed");
	}
	
	
	
	@AfterMethod
	public void TestCase_TC1_Logout() throws Exception {
		Logout_Page logout = new Logout_Page(driver, pr);
		logout.logout_successfully();
		
	
	}
	

}
