package RallerPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Usertitle extends Superadminlogin
{
WebDriver driver;
public Usertitle(WebDriver driver) {
    super(driver); // This will call the constructor of the superclass
    this.driver = driver;
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
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/ul/li[5]/a")
WebElement btnnext;
@FindBy(xpath="//table/tbody/tr[last()]/td[2]")
WebElement lastAddedUserEmail;
@FindBy(xpath="//table/tbody/tr[last()]/td[3]")
WebElement btnroleupdate;
@FindBy(xpath="/html/body/div[2]/div[1]/div/div/button")
WebElement btnlogout;
@FindBy(xpath="/html/body/div[2]/div[1]/div/form/div[3]/div/div/a")
WebElement btnfpassword;
@FindBy(xpath="//*[@id=\"email\"]")
WebElement txtreset;
@FindBy(xpath="/html/body/div[2]/form/button")
WebElement btnresetpwd;
@FindBy(xpath="/html/body/div[2]/div[2]/a")
WebElement btngoback;
@FindBy(xpath="/html/body/div[2]/div[1]/div/nav/li[3]/a")
WebElement btnuserlist;
@FindBy(xpath="/html/body/div[2]/a")
WebElement btngback;
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
public void nextbutton()
{
btnnext.click();
}
public String getLastAddedUserEmail() {
    return lastAddedUserEmail.getText();
}
public void updaterole()
{
btnroleupdate.click();
}
public void lout()
{
btnlogout.click();
}
public void fpwd()
{
btnfpassword.click();
}
public void resetemail(String uemail)
{
txtreset.sendKeys(uemail);
}
public void rpwd()
{
btnresetpwd.click();
}
public void back()
{
btngoback.click();
}
public void backlogin()
{
btngback.click();
}
public void list()
{
btnuserlist.click();
}
}

