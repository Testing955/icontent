package IcontentTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import IcontentPageObject.Signupprofessionalwithcode;
import IcontentTestBase.Baseclass;

public class Signupwithcode extends Baseclass
{
	@Test
	public void verify_signup_registrationcode()
	{
	try
	{
	Signupprofessionalwithcode se = new Signupprofessionalwithcode(driver);
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
	se.invitecode();
	//String password = randomAlphaNumeric();
	//Thread.sleep(5000);
	/*String password;
	do 
	{
	    password = randomAlphaNumeric();
	} 
	while (password.length()>8);
	Thread.sleep(5000);*/
	se.upass();;
	se.cpass();;
	se.termsc();
	se.comreg();
	}
	catch(Exception e)
	{

	Assert.fail();
	}
	}
	}

