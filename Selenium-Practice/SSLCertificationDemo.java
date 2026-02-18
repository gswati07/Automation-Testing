import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCertificationDemo {
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		WebDriver driver =new ChromeDriver(options);
		options.setAcceptInsecureCerts(true);
		
		EdgeOptions Options2=new EdgeOptions();
		WebDriver driver2=new EdgeDriver(Options2);
		Options2.setAcceptInsecureCerts(true);
				
		FirefoxOptions options1=new FirefoxOptions();
		WebDriver driver1=new FirefoxDriver(options1);
		options1.setAcceptInsecureCerts(true);
		
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
