package Objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationObj {

	WebDriver driver;
	WebElement firstname,lastname,phonenumber,email,password,confirmpassword,submit;
	public RegistrationObj(WebDriver driver)
	{
		this.driver=driver;
	}
	/*public void clicklogin(String v)
	{
		login=driver.findElement(By.name("//*[@id=\\\"header-waypoint-sticky\\\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]"));
		Select s=new Select(login);
	    s.selectByVisibleText(v);
	}*/

	public void Enterfirstname(String s)
	{
		firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys(s);
	}
	public void Enterlastname(String h)
	{
		lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys(h);
	}
	public void Enterphonenumber(String d)
	{
		phonenumber=driver.findElement(By.name("phone"));
		phonenumber.sendKeys(d);
	}
	public void Enteremail(String i)
	{
		email=driver.findElement(By.name("email"));
		email.sendKeys(i);
	}

		public void Enterpassword(String p)
	{
		password=driver.findElement(By.name("password"));
		password.sendKeys(p);
	}
	public void Enterconfirmpassword(String c)
	{
		confirmpassword=driver.findElement(By.name("confirmpassword"));
		confirmpassword.sendKeys(c);
	}
	public void clicksubmit()
	{
		submit=driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button"));
		submit.click();
	}


}








