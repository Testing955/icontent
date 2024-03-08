package Icontent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createprofessional extends Loginfunctionality
{
WebDriver driver;
public  Createprofessional (WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[1]/a[3]/span[2]")
WebElement btnprofessional;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]")
WebElement btnaddnew;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div[2]/input")
WebElement txtemail;

@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[3]/div")
WebElement btncode;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/div")
WebElement btnsendinvide;
public void profeesionaldashboard()
{
btnprofessional.click();
}
public void addnewprofessional()
{
btnaddnew.click();
}
public void useremail(String uemail)
{
txtemail.sendKeys(uemail);
}
public void generatecode()
{
	btncode.click();
}
public void sendinvitation()
{
	btnsendinvide.click();
}
}
