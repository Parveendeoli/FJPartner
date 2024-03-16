package fjportal.AdminPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminPortalLogin {

	
		
		// TODO Auto-generated method stub
		public static WebDriver driver;

		@Test
			public void  AdminPortalLogin() throws InterruptedException
			{
				 driver = new ChromeDriver();
				
				driver.get("http://13.64.144.136/qa/admin");
		        driver.manage().window().maximize();
		        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tj@simplebox.com");
		        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("{G$WGU");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		        
		        
		        Thread.sleep(6000);
		        Reporter.log("Admin Portal Login Successful", true);
		       // String currenturl= driver.getCurrentUrl();
		       // System.out.println(currenturl);
		        //Thread.sleep(2000);
		        //this.driver = driver;
			}
			

		}


