package annotationPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsSample {
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public static void afterSuite() {
		System.out.println("AfterSuite");
	}
	@Test(priority=0,description="Validation of Search Functionlity")
	public static void Onetest() {
		System.out.println("Onetest");
	}
	
	@Test(priority=1)
	public static void Twotest() {
		System.out.println("Twotest");
	}
	
	@Test(priority=2,enabled=false)
	public static void Threetest() {
		System.out.println("Threetest");
	}
	
	@BeforeClass	
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public static void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@BeforeTest
	public static void beforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public static void afterTest() {
		System.out.println("AfterTest");
	}
	
	
}
