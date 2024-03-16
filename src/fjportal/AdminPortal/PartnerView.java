package fjportal.AdminPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PartnerView extends AdminPortalLogin {

	
	@Test
	public void PartnerView() throws InterruptedException {
		// TODO Auto-generated method stub
    
    Thread.sleep(4000);
    driver.getCurrentUrl();
    
		System.out.println(driver.getCurrentUrl());
		
		//Navigate to RA
		driver.findElement(By.xpath("//span[normalize-space()='Partners']")).click();
	    Thread.sleep(4000);

		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='View']")).click();
        Reporter.log("Partner View opened Successful", true);
      //input[@id='payment-type-pay_later']
      //button[@id='entity-order-submit-btn']
		driver.close();
	}

}
