package iRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryEx1  implements IRetryAnalyzer{
	int retry_times=3;
	int initial_count=0;
	@Override
	public boolean retry(ITestResult result) {
		if(initial_count<retry_times) {
			initial_count++;
		    return true;
	}
		   return false;

}
}
