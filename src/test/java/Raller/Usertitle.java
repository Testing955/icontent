package Raller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Usertitle extends Superadminlogin
{
WebDriver driver;
public Usertitle(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="/html/body/div[2]/div[1]/div/nav/li[3]/a")
WebElement btnusermanagements;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div[2]/button")
WebElement btnAddnewusers;
@FindBy(xpath="//*[@id=\"username\"]")
WebElement txtnames;
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtemails;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div[3]/div/form/button")
WebElement btnsaves;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/ul/li[3]/a")
WebElement btnpage;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[6]/td[3]/label")
WebElement btnrolechange;
public void createusers()
{
btnusermanagements.click();
}
public void addusers()
{
btnAddnewusers.click();
}
public void usernames(String uname)
{
txtnames.sendKeys(uname);
}
public void useremmails(String uemail)
{
txtemails.sendKeys(uemail);
}
public void saves()
{
btnsaves.click();
}
public void nextpage()
{
btnpage.click();
}
public void rolechange()
{
btnrolechange.click();
}
}

