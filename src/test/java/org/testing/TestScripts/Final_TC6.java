package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Logout_Page;
import org.testing.Pages.VideoPlay_Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Final_TC6 extends Base{
	
	
	@BeforeMethod
	public void TestCase_TC1_Login() throws Exception {
		Login_Page login = new Login_Page(driver, pr); // add here driver and pr
		login.sign_in("username", "password");
		Thread.sleep(7000);
	}
	
	@Test(priority = 6)
	public void video_play_and_Comment() throws Exception {
		System.out.println(" Video play and Comment - Started");
		VideoPlay_Page videopage = new VideoPlay_Page(driver, pr);
		videopage.Click_Video_play();
		Thread.sleep(6000);
		videopage.Comment_on_videos();
		System.out.println(" Video play and Comment - Completed");
	}
	

	@AfterMethod
	public void TestCase_TC1_Logout() throws Exception {
		Logout_Page logout = new Logout_Page(driver, pr);
		logout.logout_successfully();
		
	
	}
	
	
	
	
	
	

}
