package StepDefinition;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

import Objects.loginobj;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage{
	static WebDriver driver;
WebElement login;
@Given("^open application and clicks on the login link$")
public void open_application_and_clicks_on_the_login_link() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.phptravels.net/login");
takeSnap();
}

@When("^the user enter the valid username and valid password and click submit$")
public void the_user_enter_the_valid_username_and_valid_password_and_click_submit() throws Throwable {
	loginobj d = new loginobj (driver);
	 d.Enteremail("inusha1597@gmail.com");
	  d.Enterpassword("Inusha15$");
	  d.Clicklogin();
	  takeSnap();
}

@Then("^the system navigates to Homepage$")
public void the_system_navigates_to_Homepage() throws Throwable {
	
   }
public static void takeSnap() throws IOException
{
	
File scrFile;
scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


int i=0;
Files.copy(scrFile, new File("C:\\Users\\Admin\\eclipse-workspace\\Project Mini\\Screenshot Snaps" + i  + ".png"));
i++;
System.out.println("Screenshots are Taken");

}



}










	