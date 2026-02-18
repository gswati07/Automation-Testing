package test;

import org.testng.Assert;
import org.testng.annotations.*;

/*
  Demonstrates TestNG parameterization using @Parameters and @DataProvider
  Topics: @Parameters, @DataProvider, @BeforeClass, @AfterClass
 */
public class ExampleClass2 {

    @BeforeClass
    public void setupClass() {
        System.out.println("\n[CLASS] ExampleClass2 test class initialization");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("[CLASS] ExampleClass2 test class cleanup\n");
    }

    // Parameterization using XML
    @Parameters({"browser", "url"})
    @Test(groups = {"Smoke"})
    public void launchBrowserTest(String browser, String url) {
        System.out.println("Launching " + browser + " with URL: " + url);
        Assert.assertNotNull(browser, "Browser parameter should not be null");
    }

    // Data Provider example
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"user1@test.com", "password123"},
            {"user2@test.com", "password456"},
            {"admin@test.com", "adminpass"}
        };
    }

    @Test(dataProvider = "loginData", groups = {"Regression"})
    public void loginWithMultipleUsers(String username, String password) {
        System.out.println("Testing login with: " + username);
        Assert.assertNotNull(username, "Username should not be null");
        Assert.assertTrue(password.length() > 5, "Password should be at least 6 characters");
    }

    // Data Provider for API testing
    @DataProvider(name = "apiEndpoints")
    public Object[][] getAPIEndpoints() {
        return new Object[][] {
            {"/api/users", "GET", 200},
            {"/api/products", "GET", 200},
            {"/api/orders", "POST", 201}
        };
    }

    @Test(dataProvider = "apiEndpoints", groups = {"API", "Regression"})
    public void testAPIEndpoints(String endpoint, String method, int expectedStatus) {
        System.out.println("Testing " + method + " request to " + endpoint);
        Assert.assertEquals(expectedStatus, 200, "Status code validation");
    }
}