package RallerPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Superadminlogin extends BasePage
{
WebDriver driver;
public Superadminlogin(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtemail;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement txtpwd;
@FindBy(xpath="/html/body/div[2]/div[1]/div/form/button")
WebElement btnlogin;
@FindBy(xpath="/html/body/div[2]/div[1]/div/div/button")
WebElement btnsignout;
public void efield()
{
txtemail.sendKeys("admin@gmail.com");
}
public void pwdfield()
{
txtpwd.sendKeys("Qwerty@123");
}
public void login()
{
btnlogin.click();
}
public void signoutbtn()
{
btnsignout.click();
}
}

