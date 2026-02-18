TestNG Framework - Learning Project
This is a comprehensive TestNG framework I built while learning test automation. It covers pretty much everything you need to know about TestNG - from basic annotations to advanced features like parallel execution and custom listeners.

This project demonstrates:

Basic TestNG annotations and how they work together
Test grouping and prioritization
Parameterization using both XML and DataProviders
Running tests in parallel
Custom listeners for better test reporting
Hard and soft assertions
Handling exceptions in tests
Timeouts and running tests multiple times
Test dependencies
Filtering tests with regex patterns
Retry logic for flaky tests


TestNG-Framework/
├── src/test/java/test/
│   ├── ExampleClass1.java          # Basics - annotations, groups, priorities
│   ├── ExampleClass2.java          # Parameterization examples
│   ├── ExampleClass3.java          # Working with groups and filters
│   ├── ExampleClas4.java           # Advanced stuff - timeouts, retries, etc.
│   ├── Listeners.java     # Custom listener implementation
│   └── RetryAnalyzer.java # Auto-retry for failed tests
├── testng-smoke.xml       # Quick smoke tests
├── testng-regression.xml  # Full regression suite
├── testng-parallel.xml    # Parallel test execution
└── testng-custom.xml      # Custom test selection examples

Test Groups Explained
I organized tests into different groups so you can run specific test types:

Smoke - Fast tests to verify basic functionality
Regression - Complete test coverage
API - API/backend tests
UI - Web interface tests
Mobile - Mobile app tests
Performance - Speed and load tests
Integration - End-to-end integration tests

pom.xml file
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.11.0</version>
    <scope>test</scope>
</dependency>
```

## Key Learning Points

**TestNG Execution Order:**
```
@BeforeSuite 
  → @BeforeTest 
    → @BeforeClass 
      → @BeforeMethod 
        → @Test 
      → @AfterMethod 
    → @AfterClass 
  → @AfterTest 
→ @AfterSuite

Parameterization : I've included examples of both XML-based parameters and DataProvider methods for data-driven testing.
Groups:Tests are organized into logical groups so you can run just what you need (like only API tests or smoke tests).
Parallel Execution:The framework supports running tests in parallel at different levels - by suite, test, class, or method.
Listeners:Custom listener implementation to track test execution and generate better reports.


Notes
This is a learning project I created while studying TestNG. Feel free to use it as a reference or starting point for your own automation framework. The code has comments explaining what each part does.
If you find any issues or have suggestions for improvement, let me know!
