package testcases;

import org.testng.annotations.Test;

import sauce_demo_pages.CartPage;
import sauce_demo_pages.CheckoutPage;
import sauce_demo_pages.LandingPage;
import sauce_demo_pages.LoginPage;
import sauce_demo_pages.ProductsPage;

public class SaucedemoTest extends TestBase {
	
	LoginPage loginpage;
	ProductsPage products;
	CartPage cartPage;
	CheckoutPage checkoutPage;
	LandingPage landingpage;
	
	
	@Test
    public void testSaucedemoWorkflow() {
        // 1. Login with Valid Credentials
		loginpage = new LoginPage (driver);
		loginpage.login(prop.getProperty("UserName"),(prop.getProperty("Password"))); //data

        // 2. Sort products by price high to low
		products = new ProductsPage (driver);
		products.sortProducts(prop.getProperty("SortValue")); //data

        // 3. Add products to cart
		String ProductNumber = prop.getProperty("ProductNumber");
	    int productNo = Integer.parseInt(ProductNumber);
		products.addProductsToCart(productNo);
		
        // 4. Go to cart
		products.goToCart();
		
        // 5. Proceed to checkout
		cartPage = new CartPage (driver);
        cartPage.proceedToCheckout();

        // 6. Fill checkout form
        
        checkoutPage = new CheckoutPage (driver);
        checkoutPage.fillCheckoutForm(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("PostalCode")); //data

        // 7. Cancel checkout
        checkoutPage.cancelCheckout();
        
        // 8. Logout
        landingpage = new LandingPage(driver);
        landingpage.testLogout();
        
        
    }

}
