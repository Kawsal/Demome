//this step file is particulary for pagefactory model (pagefactlogindemo.java)

package bddsteps;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LogindemostepPF {
	
	WebDriver driver=null;
	bddpageobject.pagefactlogindemo login; 

	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("Inside pagefact model - browser open "); 
	   System.setProperty("webdriver.chromer.driver","C:\\Browserdriver\\chrome.exe");
	   driver=new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
			
		driver.navigate().to("https://www.saucedemo.com/v1/");
	  System.out.println("Inside step - user is on login page"); 
	  
	  
	}


@When("User enter username as {string} and password as {string}")
public void user_enter_username_as_and_password_as(String username, String password) throws InterruptedException {
    
	login=new bddpageobject.pagefactlogindemo(driver);
	login.enterUsername(username, password);
	
	
	    
	  Thread.sleep(3000);
	}

	@And("click on login")
	public void click_on_login() throws InterruptedException {
		System.out.println("Inside step - clicked on login button");
		
		login.clickonLogin();
		//driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() throws InterruptedException {
	    driver.getPageSource().contains("Swag Labs");
	    
	    Thread.sleep(3000);
	    }

}
