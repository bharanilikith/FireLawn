package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Add New Address']")
	private WebElement addaddress;
	
	@FindBy(id="outlined-size-small")
	private WebElement nametb;
	
	@FindBy(id="outlined-size-small")
	private WebElement house;
	
	@FindBy(id="outlined-size-small")
	private WebElement street;
	
	@FindBy(id="outlined-size-small")
	private WebElement landmark;
	
	@FindBy(id="demo-simple-select-placeholder-label")
	private WebElement countrydd;
	
	@FindBy(xpath="//option[text()='State']")
	private WebElement statedd;
	
	@FindBy(id="demo-simple-select-placeholder-label")
	private WebElement citydd;
	
	@FindBy(id="outlined-size-small")
	private WebElement pincode;
	
	@FindBy(id="outlined-size-small")
	private WebElement phuumb;
	
	@FindBy(name="address")
	private WebElement addressradio;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbtn;
	
	
	public Address(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void addaddres(String name,String house1,String street1,String landmark1) {
		nametb.sendKeys(name);
		house.sendKeys(house1);
		street.sendKeys(street1);
		landmark.sendKeys(landmark1);
	}
	
	public void code(String pin,String numb) {
		pincode.sendKeys(pin);
		phuumb.sendKeys(numb);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddaddress() {
		return addaddress;
	}

	public WebElement getNametb() {
		return nametb;
	}

	public WebElement getHouse() {
		return house;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getCountrydd() {
		return countrydd;
	}

	public WebElement getStatedd() {
		return statedd;
	}

	public WebElement getCitydd() {
		return citydd;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhuumb() {
		return phuumb;
	}

	public WebElement getAddressradio() {
		return addressradio;
	}

	public WebElement getProceedbtn() {
		return proceedbtn;
	}

	public Payment addressradiobtn() {
		addressradio.click();
		proceedbtn.click();
		return new Payment(driver);
	}
	
	
	

}
