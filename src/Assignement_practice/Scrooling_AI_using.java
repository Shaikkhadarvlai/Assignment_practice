package Assignement_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Scoursecode.helptab;

public class Scrooling_AI_using 
{
	public static void main(String[] args) 
	{
		 // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the test page
        driver.get("https://practice.expandtesting.com/scrollbars");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // Locate the button element
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        
        helptab.scrollDown(driver);
         
        helptab.scrollToElement(driver, button);
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        button.click();
       
        Assert.assertTrue(driver.getCurrentUrl().contains("scrollbars"),"Fail:The url is not matched" );
        System.out.println("The url is matched");
		
	}

}
