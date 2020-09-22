package testing_project.testing_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass
{
	@Test
	public static void test()
	{
		System.out.println("setup system property for chrome");
		 System.setProperty("webdriver.chrome.driver","D:\\Jars\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.naukri.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("login_Layer"));		
		 driver.findElement(By.cssSelector("input.submit.hover")).click();
		 driver.findElement(By.cssSelector("input#eLoginNew")).sendKeys("mdrizwann25@gmail.com");
		 driver.findElement(By.cssSelector("input#pLogin")).sendKeys("Jobs@2019");
		 driver.findElement(By.cssSelector("input.submit.hover")).click();
		 //Alert alertOK = driver.switchTo().alert();
		 //alertOK.accept();
		 Alert alertCancel = driver.switchTo().alert();
		 alertCancel.dismiss();
		 driver.quit();
		 System.out.println("My new project"); 	 		 
	}
}