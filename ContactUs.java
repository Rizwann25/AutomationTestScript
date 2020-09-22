package com.atmecs.AutomationTestScripts;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeTest;
	public class ContactUs {
	       
		WebDriver driver;
	       Properties properties;
	       public ContactUs (WebDriver driver) {
	    	   this.driver = driver;
	    	   
	       }
	  @BeforeTest
	  public void settingAndLaunchingDriver() throws IOException
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Work\\testing-project-rizwan\\chromedriver.exe");
		  driver = new ChromeDriver();
		  FileInputStream file = new FileInputStream(
				  System.getProperty("user.dir") + "\\locatorsAndTestDatas\\assignment2.property\\");
		          properties = new Properties();
		          properties.load(file);
		  driver.get(properties.getProperty("url"));
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);	    
	  }
	  
	  @Test()
	  public void ContactUsScript() throws InterruptedException
	  {
		 WebElement ContactUs = driver.findElement(By.xpath(properties.getProperty("ContactUs")));
		 ContactUs.click();
		 WebElement recipientMail = driver.findElement(By.id(properties.getProperty("Recipient Mail")));
		 recipientMail.sendKeys(properties.getProperty("mailValue"));
		 
		 WebElement recipientName = driver.findElement(By.id(properties.getProperty("Recipient Name")));
		 recipientName.sendKeys(properties.getProperty("nameValue"));
		 
		 WebElement message = driver.findElement(By.id(properties.getProperty("Message")));
		 message.sendKeys(properties.getProperty("messageValue"));
		 
		 WebDriverWait w= new WebDriverWait(driver, 5);
		 WebElement button=driver.findElement(By.xpath(properties.getProperty("button3")));
		 w.until(ExpectedConditions.elementToBeClickable(button));
		 button.click();
		 Thread.sleep(1000);
		 
	  }
	  
	       
	}

