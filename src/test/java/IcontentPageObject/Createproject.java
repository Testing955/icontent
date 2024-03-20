package IcontentPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createproject extends Loginfunctionality
{
WebDriver driver;	
public Createproject(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]")
WebElement btndashboardproject;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]")
WebElement btndrp;
@FindBy(xpath="//div[contains(text(), 'Mahi singh')]")
WebElement txtselectin;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/input")
WebElement txtclaimnumber;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/img")
WebElement btndrpdown;
@FindBy(xpath="//div[contains(text(),'Fire')]")
WebElement txttloss;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/input")
WebElement txtinsurcomp;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div[5]/div/div")
WebElement btnaddproject;
public void project_setup()
{
btndashboardproject.click();
}
public void button()
{
btndrp.click();
}
public void selectinssurred()
{
	txtselectin.click();
}
public void cnumber(String claimn)
{
txtclaimnumber.sendKeys(claimn);
}
public void ldrop()
{
btndrpdown.click();
}
public void typefls()
{
txttloss.click();
}
public void insurancecomapnyname(String icn)
{
txtinsurcomp.sendKeys(icn);
}
public void ap()
{
btnaddproject.click();
}
}
