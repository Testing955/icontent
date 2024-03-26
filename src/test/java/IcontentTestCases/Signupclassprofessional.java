package IcontentTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import IcontentPageObject.signupproffesional;
import IcontentTestBase.Baseclass;

public class Signupclassprofessional extends Baseclass
{
@Test
public void verify_signup_registration()
{
try
{
signupproffesional sa = new signupproffesional(driver);
Thread.sleep(5000);
sa.signuphomepage();
sa.professionalpage();
Thread.sleep(5000);
sa.name(randomString().toUpperCase());
sa.ename(randomString().toLowerCase());
sa.efield(randomString()+"@yopmail.com");
sa.unumber(randomNumber());
Thread.sleep(5000);
sa.innercontinue();
sa.compname(randomString());
String password = randomAlphaNumeric();
Thread.sleep(5000);
/*String password;
do 
{
    password = randomAlphaNumeric();
} 
while (password.length()>8);
Thread.sleep(5000);*/
sa.upass(password);
sa.cpass(password);
sa.termsc();
sa.comreg();
}
catch(Exception e)
{

AssertJUnit.fail();
}
}
}
