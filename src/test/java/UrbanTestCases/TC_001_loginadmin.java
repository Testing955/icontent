package UrbanTestCases;

import org.testng.annotations.Test;

import Urbansoccer.Adminsigin;
import Urbansoccertestbase.BasePage;

public class TC_001_loginadmin extends BasePage
{
@Test
public void sigin() throws InterruptedException
{
Adminsigin ad = new Adminsigin(driver);
Thread.sleep(10000);
ad.efield();
ad.pwdfield();
Thread.sleep(10000);
ad.loginfield();
Thread.sleep(10000);
ad.createlogin();
}
}


