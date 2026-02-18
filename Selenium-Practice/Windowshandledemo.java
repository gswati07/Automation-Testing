import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Windowshandledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver =new ChromeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
	
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//
		Set<String> windows =  driver.getWindowHandles();//[prentid, childid)
		Iterator<String> it=windows.iterator();
		String parentsId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		String email=driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
		System.out.println(email);
		driver.switchTo().window(parentsId); 
		driver.findElement(By.id("username")).sendKeys(email);
	
	
		driver.close();
	}

}
