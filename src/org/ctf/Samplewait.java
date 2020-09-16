package org.ctf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Samplewait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srivimala\\eclipse-workspace\\WaitTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Wait w = new FluentWait(driver).withTimeout(100, TimeUnit.MILLISECONDS).pollingEvery(5, TimeUnit.MILLISECONDS).ignoring(Exception.class);
	
		//WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		
		
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("JavaSelenium");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("greens");
		
		
		w.until(ExpectedConditions.elementToBeClickable(By.id("u_0_b")));
		driver.findElement(By.id("u_0_b")).click();
		
	}
	


}
