package annotationPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
	
	@Test
	public static void verification() {
		System.out.println("Verfication");
	}
	
	@BeforeClass	
	public static void launchApplication() {
		System.out.println("Launch Application");
	}

	@AfterClass
	public static void closeApplication() {
		System.out.println("Close Application");
	}
	@BeforeMethod
	public static void Login() {
		System.out.println("Login Application");
	}
	
	@AfterMethod
	public static void Logout() {
		System.out.println("Logout Application");
	}
	
	@BeforeTest
	public static void launchBrowser() {
		System.out.println("Launch Browser");
	}
}
