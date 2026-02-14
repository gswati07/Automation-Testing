import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tc_01 {
	public static void main(String[] args) {
		//invoking browser
		//WebDriver driver=new Chromedriver();
		//chrome - chromedriver -> methods
		//create a object of a class
		
		// chromedriver.exe - > chrome driver
		//System.setProperty("webdriver.chrome.driver","path")
		
		WebDriver driver =new ChromeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource()
		//close current window of browser
		//driver.close();
		//close all the associated windows of browser
		driver.quit();
		
		
		
	}

}
