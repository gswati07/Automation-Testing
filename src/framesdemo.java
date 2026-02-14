import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class framesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		
		// count no of iframes 
		System.out.println(driver.findElements(By.id("iframe")));
		//switch to frame not any perticular webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		//driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement target = driver.findElement(By.cssSelector("div#droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); // parent window
		driver.close();
	}

}
