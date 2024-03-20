package IcontentTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import IcontentPageObject.Signupwithemail;
import IcontentTestBase.Baseclass;

public class Signupclasswithemail extends Baseclass
{
@Test
public void verify_signup_registration()
{
try
{
Signupwithemail se = new Signupwithemail(driver);
Thread.sleep(5000);
se.signuphomepage();
se.professionalpage();
Thread.sleep(5000);
se.name(randomString().toUpperCase());
se.ename(randomString().toLowerCase());
se.efield();;
se.unumber(randomNumber());
Thread.sleep(5000);
se.innercontinue();
se.compname(randomString());
String password = randomAlphaNumeric();
Thread.sleep(5000);
/*String password;
do 
{
    password = randomAlphaNumeric();
} 
while (password.length()>8);
Thread.sleep(5000);*/
se.upass(password);
se.cpass(password);
se.termsc();
se.comreg();
}
catch(Exception e)
{

Assert.fail();
}
}
}

