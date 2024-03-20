package IcontentPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginfunctionality extends Basepage
{
	WebDriver driver;
public Loginfunctionality(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//input[@placeholder='Enter your email']")
WebElement txtemail;
@FindBy(xpath="//input[@placeholder='Enter your password']")
WebElement txtpassword;
@FindBy(xpath="//div[@class='css-175oi2r r-1loqt21 r-1otgn73 r-1ugchlj r-6koalj r-1awozwy r-1777fci r-wxhkb5 r-b6yeks r-t098ez r-x7jpni r-14np3z6 r-iphfwy r-1h8ys4a r-1qhn6m8 r-i023vh r-1wh2hl7 r-e65k4z r-o8yidv r-ir6n1k']")
WebElement btnlogin;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/a[2]")
WebElement btninssured;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]")
WebElement btnaddnewinsureed;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div[2]/input")
WebElement txtfirstname;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/input")
WebElement txtlastname;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/input")
WebElement txtemailfield;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/input")
WebElement txtnumber;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[3]/div/div")
WebElement btnadd;

public void emaif()
{
txtemail.sendKeys("pkoi@yopmail.com");
}
public void passwordf()
{
txtpassword.sendKeys("Qwerty@1");
}
public void loginf()
{
btnlogin.click();
}
public void insurred()
{
btninssured.click();
}
public void ainsurred()
{
btnaddnewinsureed.click();
}
public void fname(String ifname)
{
txtfirstname.sendKeys(ifname);
}
public void lname(String ilname)
{
txtlastname.sendKeys(ilname);
}
public void efield(String emfield )
{
	txtemailfield.sendKeys(emfield);	
}
public void inumber(String inumber)
{
	txtnumber.sendKeys(inumber);
}
public void sub()
{
	btnadd.click();
}

}
