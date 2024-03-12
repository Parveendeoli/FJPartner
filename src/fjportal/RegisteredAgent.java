package fjportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisteredAgent extends App {

	public RegisteredAgent() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void RegisteredAgent() throws InterruptedException {
		// TODO Auto-generated method stub
    
    Thread.sleep(4000);
    driver.getCurrentUrl();
    
		System.out.println(driver.getCurrentUrl());
		
		//Navigate to RA
		driver.findElement(By.xpath("//a[@href='/qa/registered-agents']//span[@class='text nav-text position-relative']")).click();
	    Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@id='ra-other-tab']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//a[@id='general-info-tab']")).click();
		driver.findElement(By.xpath("//button[@id='confirm-final-submit']")).click();
		 Thread.sleep(4000);
		 // .......Submit Slideout......//
        driver.findElement(By.xpath("//input[@id='payment-type-pay_later']")).click();
        driver.findElement(By.xpath("//button[@id='entity-order-submit-btn']")).click();
        System.out.println("Payment Details entered...");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[@class='btn btn-info px-5 py-3 rounded-3 ms-3']")).click();
        Reporter.log("RA Order Submitted Successful", true);
      //input[@id='payment-type-pay_later']
      //button[@id='entity-order-submit-btn']
		driver.close();
	}

}
