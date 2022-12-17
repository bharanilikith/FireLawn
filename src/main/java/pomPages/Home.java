package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	
	public WebElement getSerachtb() {
		return serachtb;
	}

	public WebElement getSerachbtn() {
		return serachbtn;
	}

	@FindBy(id="search")
	private WebElement serachtb;
	
	@FindBy(id="search_prod")
	private WebElement serachbtn;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public Product serachelement(String productname) {
		serachtb.sendKeys(productname);
		serachbtn.click();
		return new Product(driver);
	}
	
	
	
	

}
