package Office;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginonemail 
{
	WebDriver driver;

	@BeforeClass
 void email() 
	{
//WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://mail.one.com/");
driver.manage().window().maximize();
}
@Test(priority=2)
public void log()
{
	
driver.findElement(By.xpath("//input[@placeholder='email@example.com']")).sendKeys("prince.gaurav@hestabit.in");
driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Princeg@201307#");
driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
}


	}


