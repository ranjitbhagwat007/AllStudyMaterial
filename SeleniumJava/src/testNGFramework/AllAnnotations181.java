package testNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations181 {
	@Test
	public static void test1() {
		System.out.println("Test Case1");
	}
	@Test
	public static void test2() {
		System.out.println("Test Case2");
	}
	@Test
	public static void test3() {
		System.out.println("Test Case3");
	}
	@BeforeSuite
	public static void bs() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public static void bt() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public static void bc() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public static void bm() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public static void am() {
		System.out.println("After Method");
	}
	@AfterTest
	public static void at() {
		System.out.println("After Test");
	}
	@AfterClass
	public static void ac() {
		System.out.println("After Class");
	}
	@AfterSuite
	public static void as() {
		System.out.println("After Suite");
	}
	
}
