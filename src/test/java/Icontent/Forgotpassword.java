package Icontent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgotpassword extends Basepage
{
WebDriver driver;
public  Forgotpassword(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/a/span")
WebElement btnfp;
@FindBy(xpath ="//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[4]/input")
WebElement txtemail;
@FindBy(xpath="//div[@class='css-175oi2r r-1loqt21 r-1otgn73 r-1ugchlj r-6koalj r-1awozwy r-1777fci r-wxhkb5 r-b6yeks r-t098ez r-x7jpni r-14np3z6 r-iphfwy r-1h8ys4a r-1qhn6m8 r-i023vh r-1wh2hl7 r-e65k4z r-o8yidv r-ir6n1k']/div[@class='css-146c3p1 r-jwli3a r-pbnqbl r-q4m81j r-ubezar r-135wba7']\r\n"
		+ "")
WebElement btnverifyemail;
public void forgotpwd()
{
btnfp.click();
}
public void vemail()
{
txtemail.sendKeys("princehestabit7@gmail.com");
}
public void buttonverification()
{
btnverifyemail.click();
}
}


