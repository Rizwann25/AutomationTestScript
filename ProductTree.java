

	package com.atmecs.selenium;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;


	public class ProductTree {
			
		public WebDriver driver;

	    @Test
	    public void launchChromeTest() {
	    	System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
	   
	    	@SuppressWarnings("unused")
			WebDriver  driver = new ChromeDriver();
	   
	    	driver.get(Url);
	   
	    	driver.manage().window().maximize();
	   
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	    	WebElement signin = driver.findElement(By.xpath("//a[@id='signin2']"));
	    	signin.click();
	    	
	    	@SuppressWarnings("unused")
			WebElement userName = driver.findElement(By.xpath("//input[@id='sign-username']"));
	    	userName.sendKeys("mdrizwann25@gmail.com");
	    	
			WebElement password = driver.findElement(By.xpath("//input[@id='sign-password']"));
	    	password.sendKeys("rizwan123");
	    	
	    	WebElement signButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
	    	signButton.click();
	    
	    	@SuppressWarnings("unused")
			Alert alert = driver.switchTo().alert();
	    	
	    
	    	@SuppressWarnings("unused")
			WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
	    	signButton.click();
	    	
	    
			WebElement loginUsername = driver.findElement(By.xpath("//input[@id='loginusername']"));
			loginUsername.sendKeys("mdrizwann25@gmail.com");
	    
			WebElement loginPassword = driver.findElement(By.xpath("//input[@id='loginpassword']"));
			loginPassword.sendKeys("rizwan123");
		
			WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
	    	loginButton.click();
	    	
	    
			WebElement contactButton = driver.findElement(By.xpath("//a[text()='Contact']"));
			contactButton.click();
			WebElement contactMail = driver.findElement(By.xpath("//input[@id='recipient-email']"));
			contactMail.sendKeys("mdrizwann25@gmail.com");
			WebElement contactPassword = driver.findElement(By.xpath("//input[@id='recipient-name'] "));
			contactPassword.sendKeys("rizwan123");
			WebElement contactMessage = driver.findElement(By.xpath("//textarea[@id='message-text']"));
			contactMessage.sendKeys("Mobile is at good condition");
			WebElement ContactMessageButton = driver.findElement(By.xpath("//button[text()='Send message']"));
			ContactMessageButton.click();
	    
	    	@SuppressWarnings("unused")
			Alert alert1 = driver.switchTo().alert();
	      
	    
			WebElement clickProduct = driver.findElement(By.xpath("(//h4[@class='card-title'])[1]"));
			clickProduct.click();
			WebElement addPrductToCart = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
			addPrductToCart.click();
			WebElement clicksecondProduct = driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']"));
			clicksecondProduct.click();
			WebElement addPrductSecondToCart = driver.findElement(By.xpath("//a[@onclick='addToCart(2)']"));
			addPrductSecondToCart.click();
	        }
	}

