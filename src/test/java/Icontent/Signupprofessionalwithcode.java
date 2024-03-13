package Icontent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signupprofessionalwithcode extends Basepage
{
WebDriver driver;
public Signupprofessionalwithcode(WebDriver driver)
	{
	super(driver);
	this.driver=driver;
	}
	@FindBy(xpath="//span[normalize-space()='Sign Up!']")
	WebElement btnSignup;
	@FindBy(xpath="//div[contains(text(),'Professional')]")
	WebElement btnprofessional;
	@FindBy(xpath="//input[@placeholder='Enter your first name']")
	WebElement txtfirstname;
	@FindBy(xpath="//input[@placeholder='Enter your last name']")
	WebElement txtlastname;
	@FindBy(xpath="//input[@placeholder='Enter your email address']")
	WebElement txtemail;
	@FindBy(xpath="//input[@placeholder='Enter your mobile number']")
	WebElement txtnumber;
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[6]/div/div")
	WebElement btncontinue;
	@FindBy(xpath="//input[@placeholder='Enter Company Name']")
	WebElement txtcompanyname;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[3]/div[2]/input")
	WebElement txtcode;
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement txtpassword;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div[5]/div[2]/input")
	WebElement txtconfpassword;
	@FindBy(xpath="//body//div[@id='root']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[@class='css-175oi2r']//div[1]")
	WebElement btntc;
	@FindBy(xpath="//div[@class='css-175oi2r r-1loqt21 r-1otgn73 r-1ugchlj r-6koalj r-1awozwy r-1777fci r-wxhkb5 r-b6yeks r-t098ez r-x7jpni r-14np3z6 r-iphfwy r-1h8ys4a r-1qhn6m8 r-i023vh r-1wh2hl7 r-e65k4z r-o8yidv r-ir6n1k']")
	WebElement btnregister;
	public void signuphomepage()
	{
	btnSignup.click();
	}
	public void professionalpage()
	{
	btnprofessional.click();
	}
	public void name(String fname)
	{
	txtfirstname.sendKeys(fname);
	}
	public void ename(String lname)
	{
	txtlastname.sendKeys(lname);
	}
	public void efield()
	{
	txtemail.sendKeys("evt@yopmail.com");
	}
	public void unumber(String usernum)
	{
	txtnumber.sendKeys(usernum);
	}
	public void innercontinue()
	{
	btncontinue.click();
	}
	public void compname(String companyn)
	{
	txtcompanyname.sendKeys(companyn);
	}
	public void invitecode()
	{
	txtcode.sendKeys("XWFQ2T");
	}
	public void upass()
	{
	txtpassword.sendKeys("Qwerty@1");
	}
	public void cpass()
	{
	txtconfpassword.sendKeys("Qwerty@1");
	}
	public void termsc()
	{
	btntc.click();
	}
	public void comreg()
	{
	btnregister.click();
	}
	}

