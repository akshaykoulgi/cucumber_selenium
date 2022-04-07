package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class steps_defination {
	
	WebDriver driver;
	public String URL= "https://demoapp.skillrary.com/login.php?type=login";

	
	@Given("i should open the browser and naviagte to the login page of skillrary")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_skillrary() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);	
		driver.findElement(By.linkText("LOGIN")).click();
	    
	}
	@When("Enter Username {string}")
	public void enter_username(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	   
	}
	@When("Enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	   
	}
	@When("Click on the loginbutton")
	public void click_on_the_loginbutton() {
		driver.findElement(By.id("last")).click();
	   
	}
	
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as_harry_den(String string) {
		if(string=="Harry Den") {
			
				
				String username = driver.findElement(By.className("hidden-xs")).getText();
				Assert.assertEquals(username, string);
				System.out.println(username);
				driver.close();
		}
		else {
			//@Then("i should see the admin as {string}")
			//public void i_should_see_the_admin_as(String string) {
			 String admin = driver.findElement(By.className("hidden-xs")).getText();
				Assert.assertEquals(admin, string);
				System.out.println(admin);
				driver.close();	 
	
			}
		}
		
	   
	}
	
	
//	@Then("i should see the {string}")
//	public void i_should_see_the(String string) {
//		 String Register= driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
//		 Assert.assertEquals(Register, string);
//		 driver.close();
//	}

//}
