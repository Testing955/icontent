package IcontentTestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass 
{
public WebDriver driver;
public Logger logger;
@BeforeClass
public void setup()
{
	//Loading log4j2file
	logger = LogManager.getLogger(this.getClass());
driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.get("https://icontentpro.hestawork.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
}
public String randomString()
{
String generatedString = RandomStringUtils.randomAlphabetic(3);
return generatedString;
}
public String randomNumber()
{
String generatedString = RandomStringUtils.randomNumeric(10);
return generatedString;
}
public String randomAlphaNumeric()
{
	String str=RandomStringUtils.randomAlphabetic(4);
	String num=RandomStringUtils.randomNumeric(3);
	
	return (str+"@"+num);
}


}
