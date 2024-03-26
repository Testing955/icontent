package IcontentTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import IcontentPageObject.Signuphomeowners;
import IcontentTestBase.Baseclass;

public class signuphomeowners extends Baseclass
{
@Test
public void verify_signup_homeowners()
{
try
{
Signuphomeowners sh = new Signuphomeowners(driver);
Thread.sleep(5000);
sh.signuphome();
sh.homeonwers();
sh.name(randomString().toUpperCase());
sh.ename(randomString().toLowerCase());
sh.efield(randomString()+"@yopmail.com");
sh.hnumber(randomNumber());
Thread.sleep(5000);
sh.icontinue();
Thread.sleep(10000);
String password = randomAlphaNumeric();
Thread.sleep(10000);
sh.hpass(password);
sh.hcpass(password);
sh.termsandcon();
sh.homereg();
}
catch(Exception e)
{
AssertJUnit.fail();
}
}
}

