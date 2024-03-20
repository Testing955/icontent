package RallerPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalTesting extends Existinguserchat
{
WebDriver driver;
public FinalTesting(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"chatbox\"]/div[1]/form/div[2]/label")
WebElement btnnorwegian;
@FindBy(xpath="//*[@id=\"question\"]")
WebElement txtque;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/button")
WebElement btnsending;
public void nor()
{
btnnorwegian.click();
}
public void norques1()
{
txtque.sendKeys("verdi av \"Antall sviller byttet\" fra formen Svillebytte?");
}
public void sendingnor()
{
btnsending.click();
}
public void norques2()
{
txtque.sendKeys("hva er verdien av Nøyaktig km fra - til i form Svillebytte");
}

}
