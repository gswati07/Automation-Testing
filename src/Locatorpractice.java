import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Locatorpractice {
	
	public static String getpassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement forgotPasswordLink = wait.until(
				ExpectedConditions.elementToBeClickable(By.linkText("Forgot your password?"))
			);
			forgotPasswordLink.click();
		// driver.findElement(By.linkText("Forgot your password?")).click();
		
		//"Waiting for first result to be visible...
        WebElement Result = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Siya Biradar");
        driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("Siya@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("8529637412");
        
        driver.findElement(By.className("reset-pwd-btn")).click();
        
        WebElement infoMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("infoMsg"))
        		);
		String Getpassword  = infoMessage.getText();
		String[] passwords = Getpassword.split("'");
		String password=passwords[1];
		System.out.println(password);
		return password;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//implicit wait : wait for few seconds for tag appearance in the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String name="siya";
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.name("inputPassword")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(2000); if used throw exception
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());;
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//"Waiting for first result to be visible...
        WebElement Result = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Siya Biradar");
        driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("Siya@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("8529637412");
        
        driver.findElement(By.className("reset-pwd-btn")).click();
        
        WebElement infoMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("infoMsg"))
        		);
        System.out.println(infoMessage.getText());
        String password = getpassword(driver);
        
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.cssSelector(".signInBtn")).click();
        
        String Nametext =driver.findElement(By.tagName("h2")).getText();
        System.out.println(Nametext);
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " +name+ ",");
        
        driver.findElement(By.className("logout-btn")).click();
        
        
		driver.close();
         
		
	}

}
