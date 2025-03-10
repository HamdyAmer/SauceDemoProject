package sauce_demo_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage {


	
	   public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "product_sort_container")
	    private WebElement sortDropdown;

	    @FindBy(className = "btn_inventory")
	    private List<WebElement> addToCartButtons;

	    @FindBy(className = "shopping_cart_link")
	    private WebElement cartIcon;

	    public void sortProducts(String sortOption) {
	        Select dropdown = new Select(sortDropdown);
	        dropdown.selectByValue(sortOption);
	    }

	    public void addProductsToCart(int numberOfProducts) {
	        for (int i = 0; i < numberOfProducts; i++) {
	        	addToCartButtons.get(i).click();
	        }
	    }

	    public void goToCart() {
	    	click(cartIcon);
	    
	    }

}
