package Urbansoccer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminsigin extends BaseClass
{
WebDriver driver;
public Adminsigin(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtemailfield;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement txtpasswordfield;
@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div[1]/div/form/div[4]/div[1]/button")
WebElement btnlogin;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[1]/div/div/div/a")
WebElement btncreate;
@FindBy(xpath="//*[@id=\"date\"]")
WebElement btndate;
public void efield()
{
txtemailfield.sendKeys("admin@urbansoccermanager.com");
}
public void pwdfield()
{
txtpasswordfield.sendKeys("qwerty");
}
public void loginfield()
{
btnlogin.click();
}
public void createlogin()
{
btncreate.click();	
}
public void butoon()
{
btndate.click();
}
}



