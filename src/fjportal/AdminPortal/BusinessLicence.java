package fjportal.AdminPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BusinessLicence extends PartnerView {

	
	@Test
	public void BusinessLicence() throws InterruptedException {
		// TODO Auto-generated method stub
    
    Thread.sleep(4000);
    driver.getCurrentUrl();
    
		System.out.println(driver.getCurrentUrl());
		
		//Navigate to RA
		driver.findElement(By.xpath("//span[normalize-space()='Business License']")).click();
	    Thread.sleep(4000);

		driver.findElement(By.xpath("//span[normalize-space()='Add New']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@aria-expanded='true']//span[@role='presentation']")).click();
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
