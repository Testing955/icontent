package checkboxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class urbansoccerselectdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://urbansoccermanager-stag.hestalabs.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("email")).sendKeys("admin@urbansoccermanager.com");
	driver.findElement(By.name("password")).sendKeys("qwerty");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/form/div[4]/div[1]/button")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div/div/a")).click();
	WebElement ground = driver.findElement(By.xpath("//select[@class='form-select']"));
	Select dropdownlst = new Select(ground);
dropdownlst.selectByVisibleText("Street Soccer Park");
Thread.sleep(2000);
WebElement hometeam = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[3]/div[1]/select"));
Select hometeamlist = new Select(hometeam);
hometeamlist.selectByVisibleText("Caring Soccer Club");
WebElement awayteam = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[3]/div[2]/select"));
Select awayteamlist = new Select(awayteam);
awayteamlist.selectByVisibleText("Honesty Soccer Club");
WebElement controller = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[4]/div[1]/select"));
Select controllerlist = new Select(controller);
controllerlist.selectByVisibleText("Select the Controller of the Game");
WebElement timer = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[4]/div[2]/select"));
Select timerlist = new Select(timer);
timerlist.selectByVisibleText("2m Halftime");
driver.findElement(By.xpath("//*[@id=\"game_name\"]")).sendKeys("Fifa 2026");
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // define-ocg
WebElement dateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='date']"))); // define-ocg

// Send keys to the date element
dateElement.sendKeys("2024-02-21");
/*Thread.sleep(20000);
driver.findElement(By.xpath("//*[@id=\"date\"]")).sendKeys("2024-02-21");*/

	}

}
