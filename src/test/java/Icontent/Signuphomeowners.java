package Icontent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signuphomeowners extends Basepage
{
WebDriver driver;
public Signuphomeowners(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//span[normalize-space()='Sign Up!']")
WebElement btnSignup;
@FindBy(xpath="//body/div[@id='root']/div[@class='css-175oi2r']/div[@class='css-175oi2r r-13awgt0']/div[@class='css-175oi2r r-1ro0kt6 r-16y2uox r-1wbh5a2 r-wxhkb5']/div[@class='css-175oi2r']/div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-2eszeu']/div[@class='css-175oi2r']/div[@class='css-175oi2r r-1ro0kt6 r-16y2uox r-1wbh5a2 r-13qz1uu r-1awozwy r-1te17ho']/div[@class='css-175oi2r r-97e31f r-bv2aro r-hxflta r-10xqauy r-13qz1uu']/div[@class='css-175oi2r r-ldnaw6 r-1psu60x']/div[@class='css-175oi2r r-1s39azw r-13qz1uu r-1jj8364 r-lchren']/div[@class='css-175oi2r r-6koalj r-18u37iz r-1abxp92 r-y4ewvh r-1777fci r-obd0qt']/div[2]/div[2]/div[1]")
WebElement btnhomeowners;
@FindBy(xpath="//input[@placeholder='Enter your first name']")
WebElement txtfirstname;
@FindBy(xpath="//input[@placeholder='Enter your last name']")
WebElement txtlastname;
@FindBy(xpath="//input[@placeholder='Enter your email address']")
WebElement txtemail;
@FindBy(xpath="//input[@placeholder='Enter your mobile number']")
WebElement txtnumber;
@FindBy(xpath="//div[@class='css-175oi2r r-1loqt21 r-1otgn73 r-1ugchlj r-6koalj r-1awozwy r-1777fci r-wxhkb5 r-b6yeks r-t098ez r-x7jpni r-14np3z6 r-iphfwy r-1h8ys4a r-1qhn6m8 r-i023vh r-1wh2hl7 r-e65k4z r-o8yidv r-ir6n1k']")
WebElement btncontinue;
@FindBy(xpath="//input[@placeholder='Enter password']")
WebElement txtpassword;
@FindBy(xpath="//input[@placeholder='Confirm password']")
WebElement txtconfpassword;
@FindBy(xpath="//body//div[@id='root']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[1]")
WebElement btnterms;
@FindBy(xpath="//div[@class='css-175oi2r r-1loqt21 r-1otgn73 r-1ugchlj r-6koalj r-1awozwy r-1777fci r-wxhkb5 r-b6yeks r-t098ez r-x7jpni r-14np3z6 r-iphfwy r-1h8ys4a r-1qhn6m8 r-i023vh r-1wh2hl7 r-e65k4z r-o8yidv r-ir6n1k']")
WebElement btnregister;
public void signuphome()
{
btnSignup.click();
}
public void homeonwers()
{
btnhomeowners.click();
}
public void name(String fname)
{
txtfirstname.sendKeys(fname);
}
public void ename(String lname)
{
txtlastname.sendKeys(lname);
}
public void efield(String emailfield)
{
txtemail.sendKeys(emailfield);
}
public void hnumber(String hnumber)
{
txtnumber.sendKeys(hnumber);
}
public void icontinue()
{
btncontinue.click();
}
public void hpass(String homepwd)
{
txtpassword.sendKeys(homepwd);
}
public void hcpass(String homecpwd)
{
txtconfpassword.sendKeys(homecpwd);
}
public void termsandcon()
{
btnterms.click();
}
public void homereg()
{
btnregister.click();
}
}
