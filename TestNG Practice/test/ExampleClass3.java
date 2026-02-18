package test;

import org.testng.annotations.*;

/*Demonstrates TestNG groups and method filtering
  Topics: Multiple groups, group dependencies, method regex patterns
 */
public class ExampleClass3 {

    @BeforeTest
    public void setup() {
        System.out.println("\n[TEST] Loan application tests starting...");
    }

    @AfterTest
    public void cleanup() {
        System.out.println("[TEST] Loan application tests completed\n");
    }

    @Test(groups = {"Smoke", "UI"}, priority = 1)
    public void webCarLoan() {
        System.out.println("Web Car Loan Test");
    }

    @Test(groups = {"Smoke", "Mobile"}, priority = 2)
    public void mobileCarLoan() {
        System.out.println("Mobile Car Loan Test");
    }

    @Test(groups = {"Smoke", "Regression", "API"}, priority = 3)
    public void APICarLoan() {
        System.out.println("API Car Loan Test");
    }

    @Test(groups = {"Smoke", "Regression", "API"}, priority = 4)
    public void APIHomeLoan() {
        System.out.println("API Home Loan Test");
    }

    @Test(groups = {"Regression", "API"})
    public void APIPersonalLoan() {
        System.out.println("API Personal Loan Test");
    }

    @Test(groups = {"UI"})
    public void webHomeLoan() {
        System.out.println("Web Home Loan Test");
    }

    @Test(groups = {"Mobile"})
    public void mobileHomeLoan() {
        System.out.println("Mobile Home Loan Test");
    }

    @Test(groups = {"Integration"}, dependsOnGroups = {"API"})
    public void integrationTest() {
        System.out.println("Integration Test (depends on API group)");
    }
}