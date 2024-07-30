package assertionPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert202 {

		@Test
		public void testClass() {
			
			//if the expected is true & actual is false or vice versa our test case gets failed
			//Assert.assertTrue(false);
			//Assert.assertFalse(true);
			
			//if the expected is true & actual is true or vice versa our test case gets passed
			//Assert.assertTrue(true);
			Assert.assertFalse(false);
		}
}
