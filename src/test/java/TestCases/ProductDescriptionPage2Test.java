package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.HomePage1;
import Page.ProductDescriptionPage2;

public class ProductDescriptionPage2Test extends TestBase{
	
	HomePage1 login;
	ProductDescriptionPage2 descrip;
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		login = new HomePage1();
		descrip = new ProductDescriptionPage2();
	}
	
	@Test
	public void testSamsungGalaxyaddToCart() throws Exception
	{
		login.verifySamsungGalaxy();
		descrip.addSamsungToCart();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

}
