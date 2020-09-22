package testing_project.testing_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login
{
	  @Test
	  public void test()
	  {
	      System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://www.linkedin.com/login"); 
		 WebElement username=driver.findElement(By.id("username")); 
		 WebElement password=driver.findElement(By.id("password")); 
		  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
		  username.sendKeys("example@gmail.com"); password.sendKeys("password"); 
		  login.click();  
		  driver.close();
		  //Assert.assertEquals(expectedUrl,actualUrl); 	    
	  }		  
}
