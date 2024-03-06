
package checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coachinglink {

	public static void main(String[] args) throws InterruptedException 
	{
/*WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[3]/div[2]/input")).sendKeys("princehestabit7@gmail.com");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[5]/input")).sendKeys("Qwerty@1");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[6]/div/div")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]")).click();
Thread.sleep(20000);
driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
Thread.sleep(20000);
List<WebElement>options=driver.findElements(By.xpath("//ul[contains (@class,'multiselect')]//label"));
System.out.println("Total number of the options:"+options.size());
print all the options
for(int i = 0; i<options.size();i++)
{
System.out.println(options.get(i).getText());
}
select one options
for(int i = 0; i<options.size();i++)
{
if(options.get(i).getText().equals("Java"))
{
options.get(i).click();
break;
}
}
select more than 1 options
for(int i = 0; i<options.size();i++)
{
String option = options.get(i).getText();
if(option.equals("Java")|| option.equals("Angular"))
{
	options.get(i).click();
}

}*/

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[4]/a")).click();
driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button")).click();
driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Prince");
driver.findElement(By.xpath("//div[@id='staticBackdropLive']//input[@id='lastname']")).sendKeys("Gaurav");
driver.findElement(By.xpath("//div[@id='staticBackdropLive']//input[@id='email']")).sendKeys("princehestabit7@gmail.com");
driver.findElement(By.xpath("//div[@id='staticBackdropLive']//input[@id='age']")).sendKeys("2904");
driver.findElement(By.xpath("//div[@id='staticBackdropLive']//input[@id='salary']")).sendKeys("2000000000000000000000000000000000");
driver.findElement(By.xpath("//div[@id='staticBackdropLive']//input[@id='deparment']")).sendKeys("QA");
driver.findElement(By.xpath("//input[@value='Loginonemail']")).click();

//driver.findElement(By.xpath("//li[@id='bs_1']//input[@type='checkbox']")).click();
//driver.findElement(By.xpath("//li[@id='bs_2']//input[@type='checkbox']")).click();
//List<WebElement>options=driver.findElements(By.xpath("//ul[contains (@class,'multiselect')]//label"));
//System.out.println("Total number of the options:"+options.size());*/
}
}
