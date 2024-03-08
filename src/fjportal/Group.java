package fjportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Group extends App{
	
	@Test
	public void CreateGroup() throws InterruptedException
    {
		WebDriver driver = this.driver;
//        
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[@class='menu-link p-0 m-0']/li[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='w-100 btn btn-info px-5 rounded-3 create-group-btn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("group-name")).sendKeys("John Doe");
        driver.findElement(By.id("primary-contact")).sendKeys("Group1");
        driver.findElement(By.id("group-email")).sendKeys("johndoe@doe.com");
        driver.findElement(By.id("group-phone")).sendKeys("9780152322");
        Thread.sleep(20000);

        driver.findElement((By.id("save-group-btn"))).click();
        driver.close();

    }

}
