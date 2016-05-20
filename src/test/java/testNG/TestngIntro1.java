package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class TestngIntro1 {
	static Logger log= Logger.getLogger(TestngIntro1.class);
	@BeforeMethod
	public void login()
	{
		log.info("Executing the Test case Login");
		System.out.println("Login to my System");
	}
	@Test
	public void sendEmail()
	{
		log.info("Executing the Test case sendEmail");
		System.out.println("Send email");
	}
	@AfterMethod
	public void logout()
	{
		log.info("Executing the Test case Logout");
		System.out.println("Logout from my system");
	}
	@Test
	public void checkmail()
	{
		log.info("Executing the Test case checkmail");
		System.out.println("checke email");
	}

}
