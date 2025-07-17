import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ketaki\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ketaki\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Ketaki\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("I am 2nd person who is adding to the code of 1st person.");
        driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
        //driver.close();
        //driver.quit();
	}

}
