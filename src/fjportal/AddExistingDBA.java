package fjportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class AddExistingDBA extends App {
	
	@Test
	public void AddDBA() throws InterruptedException
	{
		//WebDriver driver = this.driver;
		//String month = "March 2019";
        //String day = "20";
		
		//WebDriver driver = new ChromeDriver();
//		driver.get("http://13.64.144.136/qa/account/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parveen@filejet.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        WebElement flag = driver.findElement(By.xpath("//ul[@class='menu-link p-0 m-0']/li[11]"));
        js.executeScript("arguments[0].scrollIntoView();",flag);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[@class='menu-link p-0 m-0']/li[11]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='text-decoration-none'][text()='Existing DBA|FBN']")).click();
        Thread.sleep(3000);
        
        WebElement ddown = driver.findElement(By.id("entity_state"));
        Select select = new Select(ddown);

        select.selectByVisibleText("Florida");

        driver.findElement(By.id("county_input")).sendKeys("County 1");

        driver.findElement(By.xpath("//span[@class='selection']/span[@class='select2-selection select2-selection--single']/span[@class='select2-selection__rendered']/span[@class='select2-selection__placeholder'][text() ='Select Associated Entity']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("CTA ENTITY II");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();


        // WebElement ddown1 = driver.findElement(By.xpath("//span[@class='selection']/span[@class='select2-selection select2-selection--single']/span[@class='select2-selection__rendered']/span[@class='select2-selection__placeholder'][text() ='Select Associated Entity']"));
        // Thread.sleep(2000);
        // Select select1 = new Select(ddown1);

        // select1.selectByVisibleText("CTA ENTITY II (Profit Corporation, FL) ");

        // driver.findElement(By.xpath("//div[@class='associated-entity trade-field']")).click();

        // WebElement ddown2 = driver.findElement(By.id("select2-associate_entity-container"));
        // Select select2 = new Select(ddown2);
        // select2.selectByVisibleText("CTA ENTITY II (Profit Corporation, FL)");

       //select2.selectByIndex(0);

        WebElement flag1 = driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3 new_entity']"));
        js.executeScript("arguments[0].scrollIntoView()", flag1);

        driver.findElement(By.id("dba_name")).sendKeys("TRADE NAME I");
        driver.findElement(By.id("dba_file_number")).sendKeys("FILE NUMBER I");

        //if we select custom date 

        driver.findElement(By.id("dba_filed_date")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//th[@class='prev']")).click();

        //  while (true) {
        //      String text=driver.findElement(By.xpath("//th[@class='prev']")).click();

        //      if (text.equals(month)) {
                
        //      }

            
        // }

        //driver.findElement(By.id("dba_filed_date")).sendKeys("01/24/2024");
        //driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3 new_entity']")).click();

        driver.findElement(By.xpath("//td[@class ='day'][3]")).click();   //temporary solution - 
        driver.findElement(By.xpath("//button[@class ='btn btn-info py-3 px-5 rounded-3 ms-3 new_entity']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.id("fictitious-trade-name-tab")).click();
        Thread.sleep(3000);
        
        WebElement flag2 = driver.findElement(By.xpath("//button[@class='confirm-submit btn btn-info py-3 px-5 rounded-3 ms-3 action-btn-list confirm-final-submit-btn']"));
        js.executeScript("arguments[0].scrollIntoView();",flag2);
        
        driver.findElement(By.xpath("//input[@class='form-control input-datepicker dba-last-renewal-date dba-dates']")).click();
        Thread.sleep(3000);
               
        driver.findElement(By.xpath("//td[@class ='day'][3]")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@class='form-control input-datepicker']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//td[@class ='day'][3]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/div[17]/div[2]/div[1]/div[1]/input[1]")).sendKeys("FJ");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/div[18]/div[2]/div[1]/div[1]/input[1]")).sendKeys("FJ Team");
        driver.findElement(By.xpath("//button[@class='confirm-submit btn btn-info py-3 px-5 rounded-3 ms-3 action-btn-list confirm-final-submit-btn']")).click();
        Thread.sleep(3000);
        
        WebElement flag3 = driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3 entity-order-submit-btn']"));
        js.executeScript("arguments[0].scrollIntoView();",flag3);
        driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3 entity-order-submit-btn']")).click();
        driver.close();



	}

}
