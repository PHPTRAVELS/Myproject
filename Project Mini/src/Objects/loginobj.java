package Objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginobj {

	WebDriver driver;
	WebElement email,password,login;
	public loginobj (WebDriver driver)
	{
		this.driver=driver;
	}
	public void Enteremail(String i)
	{
		email=driver.findElement(By.name("username"));
		email.sendKeys(i);
	}

	public void Enterpassword(String p)
	{
		password=driver.findElement(By.name("password"));
		password.sendKeys(p);
	}			
	public void Clicklogin()
	{
		login=driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
		login.click();
	}
}


















