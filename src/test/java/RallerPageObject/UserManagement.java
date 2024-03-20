package RallerPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagement extends Superadminlogin
{
WebDriver driver;
public  UserManagement(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="/html/body/div[2]/div[1]/div/nav/li[3]/a")
WebElement btnusermanagement;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div[2]/button")
WebElement btnAddnewuser;
@FindBy(xpath="//*[@id=\"username\"]")
WebElement txtname;
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtemail;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div[3]/div/form/button")
WebElement btnsave;

@FindBy(xpath="/html/body/div[2]/div[1]/div/div/button")
WebElement btnlogout;
@FindBy(xpath="/html/body/div[2]/div[1]/div/form/div[3]/div/div/a")
WebElement btnforgot;
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtuseremailid;
@FindBy(xpath="/html/body/div[2]/form/button")
WebElement btnreset;
@FindBy(xpath="/html/body/div[2]/a")
WebElement btngoback;
public void createuser()
{
btnusermanagement.click();
}
public void adduser()
{
btnAddnewuser.click();
}
public void username(String uname)
{
txtname.sendKeys(uname);
}
public void useremmail(String uemail)
{
txtemail.sendKeys(uemail);
}
public void save()
{
btnsave.click();
}
public void logoutbtn()
{
btnlogout.click();
}
public void forgotpawd()
{
btnforgot.click();
}
public void useremailid()
{
txtuseremailid.sendKeys("aEYnP@yopmail.com");
}
public void resetbutton()
{
btnreset.click();
}
public void backbutton()
{
btngoback.click();
}
}

