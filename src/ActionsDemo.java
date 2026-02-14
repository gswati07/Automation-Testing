import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions a=new Actions(driver);
		// build the action and perform it
		driver.manage().window().maximize();
		// mousehover actions
		//a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).build().perform();
		
		// keyboard shortcut
		a.moveToElement(driver.findElement(By.cssSelector("[input#twotabsearchtextbox.nav-input.nav-progressive-attribute"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
		driver.close();
	}
}
