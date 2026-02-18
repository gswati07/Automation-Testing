package test;

import org.testng.Assert;
import org.testng.annotations.*;

/* Demonstrates advanced TestNG features
   Topics: Timeout, Expected Exceptions, Invocation Count, Thread Pool
 */
public class ExampleClass4 {

    @BeforeClass
    public void setupAdvancedTests() {
        System.out.println("\n[CLASS] Advanced TestNG features demonstration");
    }

    // Test with timeout
    @Test(timeOut = 2000, groups = {"Performance"})
    public void performanceTest() throws InterruptedException {
        System.out.println("Performance test (must complete within 2 seconds)");
        Thread.sleep(1000); // Simulating work
    }

    // Test expecting an exception
    @Test(expectedExceptions = ArithmeticException.class, groups = {"Regression"})
    public void divisionByZeroTest() {
        System.out.println("Testing exception handling");
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // Test with invocation count (runs multiple times)
    @Test(invocationCount = 3, groups = {"Stress"})
    public void stressTest() {
        System.out.println("Stress test iteration");
    }

    // Test with thread pool for parallel execution
    @Test(invocationCount = 5, threadPoolSize = 3, groups = {"Parallel"})
    public void parallelTest() {
        System.out.println("Parallel execution - Thread: " + Thread.currentThread().getId());
    }

    // Soft assertions
    @Test(groups = {"Regression"})
    public void softAssertionTest() {
        System.out.println("Soft Assertion Test");
        org.testng.asserts.SoftAssert softAssert = new org.testng.asserts.SoftAssert();
        
        softAssert.assertEquals("Actual", "Expected", "First assertion");
        softAssert.assertTrue(false, "Second assertion");
        softAssert.assertNotNull(null, "Third assertion");
        
        // This will report all assertion failures
        softAssert.assertAll();
    }

    // Test with description
    @Test(description = "This test validates user registration flow", groups = {"Smoke"})
    public void userRegistrationTest() {
        System.out.println("User Registration Test");
        Assert.assertTrue(true, "User registered successfully");
    }

    // Test with retry (requires IRetryAnalyzer - shown below)
    @Test(groups = {"Flaky"}, retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest() {
        System.out.println("Flaky test that might fail");
        // Simulating flaky behavior
        if (Math.random() > 0.5) {
            Assert.fail("Random failure");
        }
    }
}