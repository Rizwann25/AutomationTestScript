package com.atmecs.AutomationScriptFormat;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	
	public class GmailLogin {
	  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.gmail.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("identifierId")).sendKeys("mdrizwann25@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.className("mygmail2019")).click();
	  Thread.sleep(1000);
	  String at = driver.getTitle();
	  String et = "gmail";
	  System.out.println(at);
	  driver.close();
	  if(at.equalsIgnoreCase(et))
	  {
	      System.out.println("Test Successful");
	  }
	  else
	   { 
	   System.out.println("Test Failure");
	  }
	}


}


