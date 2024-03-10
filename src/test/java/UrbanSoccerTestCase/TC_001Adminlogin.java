package UrbanSoccerTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import UrbanSoccer.Urbansocceradminlogin;
import UrbansoccerTestBase.Baseclass;

public class TC_001Adminlogin extends Baseclass
{
@Test
public void verifysignup()
{
try
{
Urbansocceradminlogin al = new Urbansocceradminlogin(driver);
al.emailfield();
al.passwordfield();
al.loginfield();
}
catch(Exception e)
{
Assert.fail();
}
}
}
