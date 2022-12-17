package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Buy Now")
	private WebElement buy;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public Address buynow() {
		buy.click();
		return new Address(driver);
	}
	

}
