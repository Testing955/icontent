package RallerPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Existinguserchat extends NewUserChatbot
{
WebDriver driver;
public Existinguserchat(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="/html/body/div[2]/div[1]/div/nav/li[4]/a")
WebElement btnchatbot;
//@FindBy(xpath="//*[@id=\"chatbox\"]/div[3]/button/p")
@FindBy(xpath="//*[@id=\"chatbox\"]/div[2]/button/p")
WebElement btnexistingchat;
@FindBy(xpath="//*[@id=\"question\"]")
WebElement txtques;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/button")
WebElement btnsending;
public void chatb() 
{
btnchatbot.click();
}
public void existuser()
{
btnexistingchat.click();
}
public void que1()
{
txtques.sendKeys("Check the box for the type of lasher that you checked in the form Check temporary rail joint");	
}
public void sendans()
{
btnsending.click();
}
public void que2()
{
txtques.sendKeys("By whom this form Check temporary rail joint has been submitted?");	
}
public void que3()
{
txtques.sendKeys("on which date this form Check temporary rail joint has been submitted?");	
}
public void que4()
{
txtques.sendKeys("Which stretch are the joints checked in the form Check temporary rail joint ?");	
}
public void que5()
{
txtques.sendKeys("Display the person name by whom this form 101 - Mellomsveising is filled?");	
}
public void que6()
{
txtques.sendKeys("by whom this form 101 - Mellomsveising is filled has been submitted?");	
}
public void que7()
{
txtques.sendKeys("By whom the form 101 - Mellomsveising has been submitted?");	
}
public void que8()
{
txtques.sendKeys("what is the project name of the from 101 - Intermediate welding?");	
}
public void que9()
{
txtques.sendKeys("what is 1.1 - Rail quality on the 101 - Intermediate welding?");	
}
public void que10()
{
txtques.sendKeys("what is the value 3.1 - Is the weld within geometry tolerances according to Ban NOR's TRV in the form 101 - Intermediate welding?");	
}
public void que11()
{
txtques.sendKeys("Retrieve the filled values of the 'Announcement Number' field in the '101 - Loggskjema - HSV/LSV' form submitted by all users, along with the names of the users who submitted them");	
}
public void que12()
{
txtques.sendKeys("Retrieve the filled values of the 'Announcement Number' field in the '101 - Loggskjema - HSV/LSV' form submitted by all users, along with the names of the users who submitted them");	
}
public void que13()
{
txtques.sendKeys("Display the person name by whom this form 101 - Mellomsveising is filled?");	
}
public void que14()
{
txtques.sendKeys("Display the value Rail quality from the form 101 - Intermediate welding which was submitted by Stian Wiik on Jun 8 at 2:01 PM?");	
}

}
