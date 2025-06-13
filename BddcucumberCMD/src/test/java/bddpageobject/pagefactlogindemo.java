//same scenario with pagefactory

package bddpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactlogindemo {

	@FindBy(id="user-name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login-button")
	WebElement btn_login;
	
	WebDriver driver;
	
	public pagefactlogindemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this );
		//here u can also use this inplace of pagefactlogindemo.class(not working in pagefatcory)
	}
	
	public void enterUsername(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		
	}
	public void clickonLogin() {
	  btn_login.click();
	}
}
