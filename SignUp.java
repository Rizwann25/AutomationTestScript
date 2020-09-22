package com.atmecs.AutomationTestScripts;

	import java.util.Iterator;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.*;
	//import org.openqa.selenium.keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.*;

	public class SignUp {
		WebDriver driver;
		public SignUp(WebDriver driver) {
			this.driver = driver;
		}
		
		@BeforeTest
		public void settingAndLaunchingDriver()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Work\\testing-project-rizwan\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			
		}
	    @Test(priority=1)
	    
	    
	    	//textBox
	    	public void enterText(String xpath, String valueToBeSelected) {
	    	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rizwan");
	    	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mohammed");
	    	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Santosh Nagar, Hyderabad");
	    	driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("mdrizwann25@gmail.com");
	    	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8686648548");
	    }
	        //Radio Button
	    	
	    	WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio']"));
	    	if(radiobutton.isSelected()==false)
	    		radiobutton.click();
	    	
	    	//CheckBox
	        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    	if(checkbox.isSelected()==false)
	    		checkbox.click();
	    	
	    	//Select languages
	    	driver.findElement(By.id("//div[@id='msdd']")).sendKeys("English");
	    	
	    	
	    	//Select SkillsDropDown
	    	public void selectElementFromDropdown1(String xpath, String valueToBeSelected) {
	    		
	    	driver.findElement(By.xpath("//select[@id='Skills']")).sendKeys("Java");
	    	
	    	//Select CountryDropDown
	    	driver.findElement(By.xpath("//select[@id='countries']")).sendKeys("India");
	    	
	    	driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
	    
	    	}
	    	
	    	//Select DateofBirthDropDown
	    	public void selectElementFromDropdown2(String xpath, String valueToBeSelected) {
	    	driver.findElement(By.xpath("//select[@id='yearbox']")).sendKeys("1993");;
	    	driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("July");;
	    	driver.findElement(By.xpath("//select[@id='daybox']")).sendKeys("16th");;
	    	
	    	WebElement selectdateofbirth = driver.findElement(By.xpath("//span[@aria-labelledby='select2--cont']"));
	    	
	    	}
	    
	    	
	    	//Select PasswordTextField
	    	public void enterText2(String xpath, String valueToBeSelected) {
	    	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456");;
	    	
	    	
	    	//Select ConfirmpasswordTextField
	    	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456");;
	    	
	    	}
	    	//Select SubmitButton
	    	 WebElement submitbutton = driver.findElement(By.xpath("////button[@id='Button1']"));
	    	 submitbutton.click();
	    	 
	    	 //Select RefreshButton
	    	 WebElement refreshbutton = driver.findElement(By.xpath("//button[@id='submitbtn']"));
	    	 refreshbutton.click();
	    }
	}


}
