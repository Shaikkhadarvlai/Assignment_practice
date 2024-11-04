package Assignement_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Scoursecode.helptab;

public class flipkart 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    WebElement option1=driver.findElement(By.xpath("//span[text()='Fashion']"));
		option1.click();
		WebElement option2=driver.findElement(By.xpath("((//object)[1]//a)[4]"));
      option2.click();
		
		WebElement option3=driver.findElement(By.xpath("(//img[@class='_53J4C-'])[8]"));
        option3.click();
        
		//add to cart
      WebElement option4=  driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
     try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      option4.click();
		
		
	}

}
