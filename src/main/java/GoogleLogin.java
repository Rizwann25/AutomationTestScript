import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleLogin {

	      public static void main(String[] args) throws Exception 
	      {
	          System.setProperty("webdriver.chrome.driver", "D:\\Work\\testing-project-rizwan\\Chrome\\chromedriver.exe");
	          ChromeOptions options = new ChromeOptions();
	          options.addArguments("start-maximized");
	          options.setExperimentalOption("useAutomationExtension", false);
	          options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	          WebDriver driver =  new ChromeDriver(options); 
	          driver.get("https://accounts.google.com/signin");
	          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("gashu");
	          driver.findElement(By.id("identifierNext")).click();
	          new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("gashu");
	          driver.findElement(By.id("passwordNext")).click();
	          System.out.println(driver.getTitle());
	      }
	  }

