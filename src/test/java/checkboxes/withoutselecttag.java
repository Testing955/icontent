package checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withoutselecttag {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
/*driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[3]/div[2]/input")).sendKeys("princehestabit7@gmail.com");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[5]/input")).sendKeys("Qwerty@1");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[6]/div/div")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]")).click();
Thread.sleep(20000);*/
driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
//Thread.sleep(20000);
List<WebElement>options=driver.findElements(By.xpath("//ul[contains (@class,'multiselect')]//label"));
System.out.println("Total number of the options:"+options.size());
	}

}
