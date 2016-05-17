package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;;

public class TestngIntro1 {
	@BeforeMethod
	public void login()
	{
		System.out.println("Login to my System");
	}
	@Test
	public void sendEmail()
	{
		System.out.println("Send email");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from my system");
	}
	@Test
	public void checkmail()
	{
		System.out.println("checke email");
	}

}
