package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@DataProvider(name="data1")
	public Object[] [] method1(){
		return new Object [] [] {{"ram"}, {"laxman"}, {"sita"}, {"madhav"}};
		
	}
	
	@DataProvider(name="data2")
	public Object[] [] method2(){
		return new Object [] [] {{11}, {12}, {13}, {14}};
		
	}
	
		@Test(dataProvider="data1")
		public void testCase1(String name) {
			System.out.println(name.concat(" Tiwari"));
		}
		
		/*@Test(dataProvider="data2")
		public void testCase1(int age) {
			//System.out.println(age);
			System.out.println(age +100);

		}*/

}
