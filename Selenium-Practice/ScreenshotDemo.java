import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		// first convert webelement object to screenshot obj
		// we are doing casting
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Fileutils.copyFile(src,new File("C://screenshot.png"));
		
		
	}

}
