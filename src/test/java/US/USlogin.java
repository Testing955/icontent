package US;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class USlogin {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://urbansoccermanager-stag.hestalabs.com/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@urbansoccermanager.com");
//Thread.sleep(50000);
driver.findElement(By.name("password")).sendKeys("qwerty");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div/div/a")).click();
driver.findElement(By.id("date")).click();
new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("mb-3 col-md-6")));

/*String actualtitle = driver.getTitle();
String exptitle ="SoccerScoreboard";
if(exptitle==actualtitle)
{
System.out.println("Title of the page is: "+exptitle);
}
else
{
	System.out.println("Title of the page is: "+actualtitle);
}*/

	}

}
