package test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// Retry Analyzer to re-run failed tests
 
public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < MAX_RETRY_COUNT) {
            retryCount++;
            System.out.println("Retrying test: " + result.getName() + " (Attempt " + (retryCount + 1) + ")");
            return true;
        }
        return false;
    }
}