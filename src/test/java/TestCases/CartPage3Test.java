package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage3;
import Page.HomePage1;
import Page.ProductDescriptionPage2;

public class CartPage3Test extends TestBase{
	
	HomePage1 login;
	ProductDescriptionPage2 descrip;
	CartPage3 cart;
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		login = new HomePage1();
		descrip = new ProductDescriptionPage2();
		cart = new CartPage3();
	}
	
	@Test
	public void TestClickCart()
	{
		login.verifySamsungGalaxy();
		descrip.addSamsungToCart();
		cart.CartButton();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
