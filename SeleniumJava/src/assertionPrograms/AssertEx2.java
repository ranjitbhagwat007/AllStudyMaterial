package assertionPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx2 {
	
	@Test
	public void testClass() {
		
			//Assert.assertEquals(false,false);
			Assert.assertEquals(true,false,"sry it doesn't match");//TC gets failed..here actual reslt is true & expctd is false so OK will get printed
			Assert.assertEquals(false,false,"sry it doesn't match");//TC gets passed & OK will not get printed
			Assert.assertEquals(11,90,"sry it doesn't match");
			/*Assert.assertEquals(byte actual, byte expected,"sry it doesn't match");
			Assert.assertEquals(short actual, short expected,"sry it doesn't match");
			Assert.assertEquals(int actual, int expected,"sry it doesn't match");
			Assert.assertEquals(long actual, long expected,"sry it doesn't match");
			Assert.assertEquals(char actual, char expected,"sry it doesn't match");
			Assert.assertEquals(String actual, String expected,"sry it doesn't match");
			Assert.assertEquals(float actual, float expected,"sry it doesn't match");
			Assert.assertEquals(double actual, double expected,"sry it doesn't match");*/

	}
}
