package sauce_demo_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	static WebDriver driver;

    @SuppressWarnings("static-access")
	public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    protected void click(WebElement element) {
    	
    element.click();
    }
    
    protected void sendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

}
