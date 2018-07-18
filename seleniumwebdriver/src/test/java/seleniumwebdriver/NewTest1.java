package seleniumwebdriver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest1 {
	@Parameters("browser")
	@Test
	
	public void testlogin(String value)
	{
	WebDriver driver=null;
	if(value.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B8C.07.19\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	driver =new ChromeDriver();
	}
	else if(value.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_B8C.07.19\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	driver =new FirefoxDriver();
	}
	else
	{
		System.out.println("No Driver Found");
	}
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("divyasreeannareddy");
	driver.findElement(By.id("password")).sendKeys("Bvbr3knj3");
	driver.findElement(By.name("commit")).click();
	String actual=driver.getTitle();
	System.out.println(actual);
	Assert.assertEquals(actual, "GitHub");
	System.out.println("Pull");	
	}
}
