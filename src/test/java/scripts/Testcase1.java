package scripts;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Ecommerce.Firelawn.genericLIb.BaseClass;

import pomPages.Address;
import pomPages.Cart;
import pomPages.Home;
import pomPages.Login;
import pomPages.Payment;
import pomPages.Product;
import pomPages.Welcome;

public class Testcase1 extends BaseClass {
	@Test
	public void demo() throws IOException, InterruptedException, SQLException {
	test=reports.createTest("Testcase1");
	Welcome w=new Welcome(driver);
	Login l = w.loginButton();
	Home us = l.logindetails(fu.getPropertydata("username"),fu.getPropertydata("password"));
	
	Thread.sleep(15000);
	
	Product s = us.serachelement(fu.getexcelData("Sheet1",1,0));

	Thread.sleep(15000);
	Cart c = s.addtocartbtn();
	Thread.sleep(5000);
	Address b = c.buynow();
	b.addaddres(fu.getexcelData("Sheet1",1,0),fu.getexcelData("Sheet1",1,0),fu.getexcelData("Sheet1",1,0),fu.getexcelData("Sheet1",1,0));
	webutilies.dropdown(b.getCountrydd(),fu.getPropertydata("country"));
	webutilies.dropdown(b.getStatedd(),fu.getPropertydata("state"));
	webutilies.dropdown(b.getCitydd(),fu.getPropertydata("city"));
	  b.code(fu.getPropertydata("code"),fu.getPropertydata("phnum"));
	 Payment ad = b.addressradiobtn();
 ad.carddetails(fu.queryExecution(1,"Bharani"),(fu.queryExecution(2,"5014401191606445")),
(fu.queryExecution(3,"7649")),(fu.queryExecution(4,"12")),
(fu.queryExecution(5,"27")),fu.queryExecution(6,"441"));
		
	 
	
	
	
	
	}

}
