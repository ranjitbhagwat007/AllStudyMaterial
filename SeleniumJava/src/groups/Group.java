package groups;

import org.testng.annotations.Test;

public class Group {
	
	@Test(groups= {"smoke", "system"})
	public void testCase1() {
		
	}
	@Test(groups= {"smoke"})
	public void testCase2() {
		
	}
	@Test(groups= {"system"})
	public void testCase3() {
		
	}
	@Test(groups= {"smoke"})
	public void testCase4() {
		
	}
	@Test(groups= {"system"})
	public void testCase5() {
		
	}
}
