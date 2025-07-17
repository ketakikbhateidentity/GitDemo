import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ketaki\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Thread.sleep(3000);
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		Thread.sleep(3000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//driver.findElement(By.xpath("//nav/a")).click();
		//driver.findElement(By.name("name")).sendKeys("Ketaki");
		//driver.findElement(By.name("email")).sendKeys("ketakikbhate@gmail.com");
		//driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("abcd");
		
		
		
		
		//driver.close();
		
		

	}

}
