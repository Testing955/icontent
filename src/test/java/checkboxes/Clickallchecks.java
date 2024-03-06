package checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickallchecks {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Shoes For Men");
driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
WebElement size=driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[2]/ul/li[3]/label"));
size.click();
Thread.sleep(1000);
List<WebElement>options=driver.findElements(By.xpath("//ul[@class='atsa-values']//label"));
System.out.println("Total no of checkboxes: "+options.size());
/*for(int i = 0; i<options.size();i++)
{
options.get(i).click();
}*/
/*for(WebElement opt:options)
{
opt.click();
}*/
//Selecting the last two checkboxe i.e total no of checkbox-how many check box need to check: 40-2=38
/*for(int i = 38; i<options.size();i++)
{
options.get(i).click();
}*/
//Select first 2 check boxes
/*for(int i = 0; i<2;i++)
{
	options.get(i).click();
}*/
//or in another way
/*for(int i = 0; i<options.size();i++)
{
if(i<2)
{
options.get(i).click();
}
}*/

//Unselect all check boxes
/*for(int i = 0; i<options.size();i++)
{
options.get(i).click();
}
Thread.sleep(4000);
for(int i =0; i<options.size();i++)
{
options.get(i).click();
}*/

//IF i have to select only 3 check boxes and then unselect of it
for(int i = 0; i<3; i++)
{
options.get(i).click();
}
Thread.sleep(4000);
/*for(int i = 0; i<options.size();i++)
{
if(options.get(i).isSelected())
{
options.get(i).click();
}
}*/
for(WebElement opt:options)
{
opt.click();	
}
}
}
