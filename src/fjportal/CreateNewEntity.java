package fjportal;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class CreateNewEntity extends App  {
	
	public CreateNewEntity() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void createEntity() throws InterruptedException
	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://13.64.144.136/qa/account/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parveen@filejet.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//WebDriver driver = this.driver;
		
		driver.getCurrentUrl();
		System.out.println("p2");

		//create new entity
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='d-flex justify-content-between align-items-end pt-4 mt-4']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-info px-4 rounded-3 text-uppercase w-100 d-flex align-items-center']")).click();
        
        WebElement ddown = driver.findElement(By.id("formation_type"));
        Select select = new Select(ddown);

        // select.selectByIndex(0);                 //by index starting from [0]

       // select.selectByValue(null);             //pass the value

        select.selectByVisibleText("Domestic");       //pass text

        WebElement ddown1 = driver.findElement(By.id("entity_state"));
        Select select1 = new Select(ddown1);
        select1.selectByIndex(5);

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Automation Entity I");
        Thread.sleep(200);

        WebElement ddown2 = driver.findElement(By.id("type"));
        Select select2 = new Select(ddown2);
        select2.selectByVisibleText("LLC");
        driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3 new_entity']")).click();
        Thread.sleep(2000);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,1000)", "");

        WebElement flag = driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3']"));
        js.executeScript("arguments[0].scrollIntoView();",flag);
        driver.findElement(By.xpath("//button[@class='btn btn-info py-3 px-5 rounded-3 ms-3']")).click();

        Thread.sleep(2000);

        WebElement flag1 = driver.findElement(By.xpath("//input[@class='form-control fs-6 validate[required,minSize[5]] zip_format']"));
        js.executeScript("arguments[0].scrollIntoView();",flag1);
        driver.findElement(By.id("business-address")).sendKeys("10628 S San Pedro St");
        driver.findElement(By.id("business-city")).sendKeys("Los Angeles");
        Thread.sleep(2000);

        WebElement ddown3 = driver.findElement(By.name("business_state_id"));
        Select select3 = new Select(ddown3);
        select3.selectByVisibleText("California");
        driver.findElement(By.xpath("//input[@class='form-control fs-6 validate[required,minSize[5]] zip_format']")).sendKeys("92880");

        WebElement flag2 = driver.findElement(By.xpath("//input[@class='form-control validate[required,minSize[5]] zip_format']"));
        js.executeScript("arguments[0].scrollIntoView();",flag2);

        driver.findElement(By.name("agent_firstname")).sendKeys("FJ");
        driver.findElement(By.name("agent_lastname")).sendKeys("Agent");
        driver.findElement(By.name("agent_address")).sendKeys("16998 W Bernardo Dr");
        driver.findElement(By.id("agent-city")).sendKeys("San Diego");
        Thread.sleep(2000);

        WebElement ddrop4 = driver.findElement(By.name("agent_state_id"));
        Select select4 = new Select(ddrop4);
        select4.selectByVisibleText("California");
        driver.findElement(By.id("agent-zip")).sendKeys("92127");

        WebElement flag3 = driver.findElement(By.xpath("//button[@class='confirm-submit btn btn-info py-3 px-5 rounded-3 ms-3 action-btn-list confirm-final-submit-btn']"));
        js.executeScript("arguments[0].scrollIntoView();",flag3);

        driver.findElement(By.name("organizer_name_1")).sendKeys("FJ Agent");
        driver.findElement(By.xpath("//button[@class='confirm-submit btn btn-info py-3 px-5 rounded-3 ms-3 action-btn-list confirm-final-submit-btn']")).click();

        Thread.sleep(15000);
                
        driver.findElement(By.id("entity-order-submit-btn")).click();

        Thread.sleep(3000);
        Reporter.log("New Entity created Successful", true);
        
       // driver.findElement(By.xpath("//a[@class='btn btn-info px-5 py-3 rounded-3 ms-3']")).click();
        
       // driver.close();

    }
    

	}


