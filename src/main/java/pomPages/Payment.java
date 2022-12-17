package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;
	@FindBy(xpath="//button[text()='Add Card']")
	private WebElement cart;
	
	
	@FindBy(xpath="//label[text()='Card Number']")
	private WebElement cardnumb;
	
	@FindBy(xpath="//input[@placeholder='John Wick']")
	private WebElement name;
	
	@FindBy(xpath="//label[text()='PIN']")
	private WebElement pin;
	
	@FindBy(xpath="//label[text()='Expiry Month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath="//label[text()='Expiry Year']")
	private WebElement expiryyear;
	
	@FindBy(xpath="//label[text()='CVV']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@value='DEBIT']")
	private WebElement debit;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")
	private WebElement pintb;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement sumbitbtn;
	
	public Payment(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void carddetails(String acct,String cno,String pinno,String expm,String expy,String cvvno) {
		name.sendKeys(acct);
		cardnumb.sendKeys(cno);
		pin.sendKeys(pinno);
		expiryMonth.sendKeys(expm);
		expiryyear.sendKeys(expy);
		cvv.sendKeys(cvvno);
		
	}
	
	public void cards() {
		debit.click();
		radio.click();
		sumbitbtn.click();
	}
	
	

}
