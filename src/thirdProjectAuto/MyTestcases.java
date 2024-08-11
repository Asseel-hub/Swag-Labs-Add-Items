package thirdProjectAuto;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcases {
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void mysetUp() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test (priority = 1)
	public void loginTest() {
	String username ="standard_user";
	String password = "secret_sauce";
		
	WebElement usernameInput =   driver.findElement(By.id("user-name"));
	WebElement passwordInput =   driver.findElement(By.id("password"));
	WebElement loginButton =     driver.findElement(By.id("login-button"));
	
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginButton.click();

	}
	
	@Test(priority = 2)
	public void addToCardallItems() throws InterruptedException {  // by className " " with out  any spaces  
		List<WebElement> AddtoCartButtons = driver.findElements(By.className("btn"));
		for (int i=0 ; i < AddtoCartButtons.size() ;i++) {
		AddtoCartButtons.get(i).click();
		
			
		}
		Thread.sleep(4000);
	}
	@Test(priority = 3)
	public void removeAllitemsFromCard() {
		List<WebElement> RemovefromCartButtons = driver.findElements(By.className("btn_secondary")); // Or "btn"
		for (int i=0 ; i< RemovefromCartButtons.size() ;i++) {
			RemovefromCartButtons.get(i).click();
			
			
		}
		
		//The Worst way 

		/*driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();

		*/
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
