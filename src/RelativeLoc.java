import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Shreya");
		
		WebElement EmailEditBox=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		EmailEditBox.sendKeys("abc@gmail.com");
		System.out.println(driver.findElement(with(By.tagName("label")).above(EmailEditBox)).getText());
		WebElement DOBEditBox = driver.findElement(By.cssSelector("input.form-control"));
		//driver.findElement(with(By.tagName("input")).below(EmailEditBox)).click();
		System.out.println(driver.findElement(with(By.tagName("label")).below(DOBEditBox)).getText());
		
		//driver.close();
	}
}
