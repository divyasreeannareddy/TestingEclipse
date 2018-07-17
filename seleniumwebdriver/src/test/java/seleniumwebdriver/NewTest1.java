package seleniumwebdriver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
	@Test
	public void testlogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B8C.07.19\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("divyasreeannareddy");
	driver.findElement(By.id("password")).sendKeys("Bvbr3knj3");
	driver.findElement(By.name("commit")).click();
	String actual=driver.getTitle();
	System.out.println(actual);
	Assert.assertEquals(actual, "GitHub");
	System.out.println(actual);
	}
}
