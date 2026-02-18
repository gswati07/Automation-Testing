import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.ArrayList;

public class Dropdowns {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.manage().window().maximize();
        
        WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticdropdown);

        // Store all options FIRST before any selections
        List<String> optionTexts = new ArrayList<>();
        List<WebElement> allOptions = dropdown.getOptions(); // html format and selenium gives returns in webelement format..
        
        for(WebElement option : allOptions) {
            optionTexts.add(option.getText());
        }
        
        System.out.println("All options: " + optionTexts);

        // selections
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("Option1");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("option3");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        // Dynamic dropdown
        driver.navigate().to("https://www.spicejet.com");
        

        //driver.quit();
    }
}