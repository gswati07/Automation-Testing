
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Windowsactivities {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();		
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.findElement(By.linkText("Browse Courses")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().minimize();
		
		
		
	}

}
