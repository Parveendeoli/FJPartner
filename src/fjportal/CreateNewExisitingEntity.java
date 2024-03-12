package fjportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.UUID;
import java.util.Random;


public class CreateNewExisitingEntity extends CreateNewEntity {
    public CreateNewExisitingEntity() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
    public void CreateNewExisitingEntity() throws InterruptedException {
		
		
     
		Thread.sleep(4000);
        driver.getCurrentUrl();

        // Add New Exisiting Entity
        driver.findElement(By.xpath("//a[@href='/qa/entities']")).click();
        driver.findElement(
                By.xpath("//a[@class='btn btn-info px-4 rounded-3 text-uppercase w-100 d-flex align-items-center']"))
                .click();
        driver.findElement(By.xpath("//input[@id='entity_type1']")).click();
        // Existing Domestic
        WebElement dropdownformationType = driver.findElement(By.xpath("//select[@id='formation_type']"));
        Select dropdown = new Select(dropdownformationType);
        dropdown.selectByVisibleText("Domestic");
        Thread.sleep(2000);
        // State: California Delaware New York
        WebElement dropdownEntityState = driver.findElement(By.xpath("//select[@id='entity_state']"));
        Select dropdown1 = new Select(dropdownEntityState);
        dropdown1.selectByVisibleText("California");
        Thread.sleep(2000);
        // ...Entity Name

     // Generate a unique key
        String uniqueName = "Rainbow Rising Co. " + UUID.randomUUID().toString();

        // Send the unique key as the name to the input field
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(uniqueName);
        
        
        // Entity Type: LLC
        WebElement dropdownEntityType = driver.findElement(By.xpath("//select[@id='type']"));
        Select dropdown2 = new Select(dropdownEntityType);
        dropdown2.selectByVisibleText("LLC");
        // ...Entity State File Number
        
        // Generate a unique 8-character alphanumeric key
        String uniqueKey = generateRandomAlphaNumeric(8);
        // Send the unique key to the input field
      //  driver.findElement(By.xpath(“//input[@id=‘file_number’]“)).sendKeys(uniqueKey);
        
        driver.findElement(By.xpath("//input[@id='file_number']")).sendKeys(uniqueKey);
        driver.findElement(By.xpath("//input[@id='filed_date']")).click();

        driver.findElement(By.xpath("//td[normalize-space()='15']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3 new_entity']")).click();
        System.out.println("SetUp Entity Details entered...");
        Thread.sleep(3000);

        // .....Select Service page....//
        driver.findElement(By.xpath("//input[@id='entity_articles']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='NEXT']")).click();
        System.out.println("Entity Service Selected...");
        Thread.sleep(3000);

        // .......Entity Details page.......//
        driver.findElement(By.xpath("//input[@id='business-address']")).sendKeys("5901 center dr,");
        driver.findElement(By.xpath("//input[@id='business-city']")).sendKeys("los angles");
        WebElement dropdownSelectState = driver.findElement(By.xpath("//select[@name='business_state_id']"));
        Select dropdown3 = new Select(dropdownSelectState);
        dropdown3.selectByVisibleText("California");
        driver.findElement(By.xpath("//input[@id='business-zip']")).sendKeys("90045");
        driver.findElement(By.xpath("//input[@id='agent-for-service-of-process-option-1']")).click();
        driver.findElement(By.xpath("//input[@id='corporate-agent-name']")).sendKeys("Evan Walsh");
        driver.findElement(By.xpath("//input[@id='organizer-name-1']")).sendKeys("TJ");
        driver.findElement(By.xpath("//button[@id='confirm-final-submit']")).click();
        System.out.println("SetUp Entity Details entered...");
        Thread.sleep(2000);

        // .......Submit Slideout......//
        driver.findElement(By.xpath("//input[@id='payment-type-pay_later']")).click();
        driver.findElement(By.xpath("//button[@id='entity-order-submit-btn']")).click();
        System.out.println("Payment Details entered...");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[@class='btn btn-info px-5 py-3 rounded-3 ms-3']")).click();
        Reporter.log("New Existing Entity created Successful", true);


      //  driver.findElement(By.xpath("//a[normalize-space()='PERFORM ANOTHER']")).click();

        // driver.close();
    }
	 // Method to generate a random alphanumeric string of a specified length
    public static String generateRandomAlphaNumeric(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
        }

}


