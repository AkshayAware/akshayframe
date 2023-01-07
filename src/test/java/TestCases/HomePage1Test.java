package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.HomePage1;

public class HomePage1Test extends TestBase {
	
	HomePage1 login;
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		login = new HomePage1();
	}
	
	@Test (enabled=false)
	public void testUpperLogo()
	{
		login.verifyupperlogo();
	}
	
	@Test (enabled=false)
	public void testLowerLogo()
	{
		boolean result = login.verifylowerlogo();
	}
	
	@Test
	public void testSamsungGalaxy()
	{
		login.verifySamsungGalaxy();
	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
