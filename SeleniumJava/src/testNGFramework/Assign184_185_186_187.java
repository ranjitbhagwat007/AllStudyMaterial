package testNGFramework;

import org.testng.annotations.Test;

public class Assign184_185_186_187 {
	@Test(priority=-1)
	public static void mul() {
		System.out.println("Test Case1");
	}
	@Test(invocationCount=3)
	public static void add() {
		System.out.println("Test Case2");
	}
	@Test(priority=0)
	public static void sub() {
		System.out.println("Test Case3");
	}
	@Test(enabled=false)
	public static void div() {
		System.out.println("Test Case3");
	}
	@Test(priority=-1,invocationCount=2 )
	public static void get() {
		System.out.println("Test Case3");
	}
}
