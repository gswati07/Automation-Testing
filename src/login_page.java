import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.name("password")).sendKeys("Learning@830$3mK2");\
		driver.findElement(By.className("radiotextsty")).click();
		driver.findElement()
		
		
		
		
		
	}

}
