package RallerPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserChatbot extends Superadminlogin
{
WebDriver driver;
public NewUserChatbot(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="/html/body/div[2]/div[1]/div/nav/li[4]/a")
WebElement btnchatbot;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/button")
WebElement btnnewchat;
@FindBy(xpath="//*[@id=\"chatbox\"]/div[1]/form/div[1]/label")
WebElement btneng;
@FindBy(xpath="//*[@id=\"question\"]")
WebElement txtquestion1;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/button")
WebElement btnsend;
public void chat()
{
btnchatbot.click();
}
public void newchat()
{
btnnewchat.click();
}
public void eng()
{
btneng.click();
}
public void question1()
{
txtquestion1.sendKeys("when was 105 - Svillebytte form lastly filled?");
}
public void send()
{
btnsend.click();
}
public void question2()
{
txtquestion1.sendKeys("what are the Number of sleepers changed in form Svillebytte from sep 5 to aug 23?");
}
}
