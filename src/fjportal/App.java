package fjportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
	public WebDriver driver;

	
	public App()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://13.64.144.136/qa/account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parveen@filejet.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        this.driver = driver;
	}
	

}
