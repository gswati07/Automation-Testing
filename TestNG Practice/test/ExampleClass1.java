package test;

import org.testng.Assert;
import org.testng.annotations.*;

/*
  Demonstrates basic TestNG annotations and test execution order
  Topics: @BeforeSuite, @AfterSuite, @BeforeTest, @AfterTest, @BeforeMethod, @AfterMethod, Groups
 */
public class ExampleClass1 {

    @BeforeSuite
    public void setupSuite() {
        System.out.println("\n[SUITE] Setting up test environment...");
    }

    @AfterSuite
    public void teardownSuite() {
        System.out.println("[SUITE] Cleaning up test environment...\n");
    }

    @BeforeTest
    public void setupTest() {
        System.out.println("[TEST] Initializing test data for Day1");
    }

    @AfterTest
    public void cleanupTest() {
        System.out.println("[TEST] Test execution completed for Day1");
    }

    @BeforeMethod
    public void beforeEachTest() {
        System.out.println("[METHOD] Setting up before test method");
    }

    @AfterMethod
    public void afterEachTest() {
        System.out.println("[METHOD] Cleaning up after test method\n");
    }

    @Test(priority = 1, groups = {"Smoke", "Sanity","Regression"})
    public void loginTest() {
        System.out.println("Executing Login Test");
        Assert.assertTrue(true, "Login should be successful");
    }

    @Test(priority = 2, groups = {"Smoke"})
    public void dashboardTest() {
        System.out.println("Executing Dashboard Test");
        Assert.assertEquals("Dashboard", "Dashboard", "Dashboard loaded successfully");
    }

    @Test(priority = 3, groups = {"Regression"}, dependsOnMethods = {"loginTest"})
    public void userProfileTest() {
        System.out.println("Executing User Profile Test");
        // This test depends on loginTest
    }

    @Test(enabled = false)
    public void disabledTest() {
        // This test will be skipped
        System.out.println("This test is disabled");
    }
}