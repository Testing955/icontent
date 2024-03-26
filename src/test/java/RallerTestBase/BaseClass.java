package RallerTestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
public WebDriver driver;
public Logger logger;
@BeforeClass
public void setup()
{
//Loading log4j2file
logger = LogManager.getLogger(this.getClass());
//driver = new ChromeDriver();
driver=new SafariDriver();
driver.get("https://railverify.hestawork.com/login");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public String randomString()
{
String generatestring = RandomStringUtils.randomAlphabetic(5);
return generatestring;
}
public String randomNumber()
{
String generatestring = RandomStringUtils.randomNumeric(10);
return generatestring;
}
public String randomAlphaNumberic()
{
String str = RandomStringUtils.randomAlphabetic(5);
String nbr = RandomStringUtils.randomNumeric(10);
return (str+"@"+nbr);
}
}
