package checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownnike {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.nike.com/in/");
//Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"hf_title_joinus_membership\"]")).click();
driver.findElement(By.xpath("//*[@id=\"ba709337-d7e8-4e90-8f97-7855515d7e38\"]/div/div/nav/div[1]/ul/li/a")).click();
Thread.sleep(5000);
//driver.findElement(By.xpath("//*[@id=\"hf_title_joinus_membership\"]")).click();
//WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='css-x97bln']")));
//WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
//WebElement element = waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//div[@class='css-nohim6' and @class='css-t4rufh']")));
//element.click();
driver.findElement(By.xpath("//div[@class='css-nohim6' or @class='css-t4rufh']")).click();
Thread.sleep(5000);
new Select(driver.findElement(By.xpath("//select[@id='country']"))).selectByVisibleText("Australia");
//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("princehestabit87@gmail.com");
//countryDropdown.click();
/*List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"country\"]/option[1]"));

String option = "Highest to lowest";

// Iterate the list using for loop

for (int i = 0; i < allOptions.size(); i++) {

      if (allOptions.get(i).getText().contains("Afghanistan")) {

            allOptions.get(i).click();

            System.out.println("clicked");

            break;

      }*/
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("princehestabit7@gmail.com");
//driver.quit();
	}
	}
