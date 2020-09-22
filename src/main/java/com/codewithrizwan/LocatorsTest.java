package com.codewithrizwan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.hrberry.com/smarthr/index.php?q=cms&m=index&client=atmecs");
	  driver.findElement(By.cssSelector("input#userid")).sendKeys("922");
	  driver.findElement(By.cssSelector("input#password")).sendKeys("Kushi@2019");
	  driver.findElement(By.cssSelector("input.submit.hover")).click();
  }
}
