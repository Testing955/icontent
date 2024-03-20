package IcontentTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import IcontentPageObject.Createproject;
import IcontentTestBase.Baseclass;

public class Projectcreationtestcases extends Baseclass
{
@Test
public void pcreation()
{
try
{
Createproject cf = new Createproject(driver);
cf.emaif();
cf.passwordf();
cf.loginf();
cf.project_setup();
cf.button();
cf.selectinssurred();
cf.cnumber(randomNumber());
cf.ldrop();
cf.typefls();
cf.insurancecomapnyname(randomString());
cf.ap();
}
catch(Exception e)
{
	 e.printStackTrace(); // This will print the stack trace to the console
	    Assert.fail("Test failed due to exception: " + e.getMessage());
}
}
}
