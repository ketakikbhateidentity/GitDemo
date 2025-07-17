import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Give me the count of the links on the page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ketaki\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totallinks=links.size();
		System.out.println(totallinks);
		driver.close();
		
		
	}

}
