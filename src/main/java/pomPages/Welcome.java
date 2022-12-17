package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	public WebDriver driver;
	
	@FindBy(id="fl_login_btn")
	private WebElement loginbtn;
	
	public Welcome(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public Login loginButton(){
	loginbtn.click();
	return new Login(driver);
	}
	

}
