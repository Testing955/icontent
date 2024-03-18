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
ad.efield();
ad.pwdfield();
ad.loginfield();

}
}


