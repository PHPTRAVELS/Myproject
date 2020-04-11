package StepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Objects.RegistrationObj;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegistrationPage {
	static WebDriver driver;
	WebElement signup;
		@Given("^open application and click on Registration link$")
		public void open_application_and_click_on_Registration_link() throws Throwable { 
				 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				   driver=new ChromeDriver();
				   driver.get("https://www.phptravels.net/register");
				
				   
		   	}

		@When("^the user enter the details and click register$")
		public void the_user_enter_the_details_and_click_register() throws Throwable {
			RegistrationObj d=new     RegistrationObj(driver);
			  d.Enterfirstname("Inusha");
			  d.Enterlastname("Gollapalli");
			  d.Enterphonenumber("1234567890");
			  d.Enteremail("inusha1597@gmail.com");
			  d.Enterpassword("Inusha15$");
			  d.Enterconfirmpassword("Inusha15$");
			  d.clicksubmit();
	}

		@Then("^the system stores the details and automatically logs in$")
		public void the_system_stores_the_details_and_automatically_logs_in() throws Throwable {
		
		    	}
	}














