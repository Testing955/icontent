package UrbanSoccer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Urbansocceradminlogin extends Basepage
{
WebDriver driver;
public Urbansocceradminlogin (WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtemail;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement txtpassword;
@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div[1]/div/form/div[4]/div[1]/button")
WebElement btnlogin;
public void emailfield()
{
txtemail.sendKeys("admin@urbansoccermanager.com");
}
public void passwordfield()
{
txtpassword.sendKeys("qwerty");
}
public void loginfield()
{
btnlogin.click();
}
}
