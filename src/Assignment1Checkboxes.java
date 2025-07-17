import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Checkboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ketaki\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.id("checkBoxOption1")).click();
        boolean status = driver.findElement(By.id("checkBoxOption1")).isSelected();
        AssertJUnit.assertEquals(status,true);
        
        
        
        
	}

}
