package Assignement_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test
{
	public static void main(String[] args)
	{

        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/s?k=books&crid=1LSC1WSMT524K&sprefix=books%2Caps%2C342&ref=nb_sb_noss_2");
		 
		 
		WebElement  book= driver.findElement(By.xpath("(//img[@class='s-image'])[8]"));
		 
		// Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

       // Use JavascriptExecutor to scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true)",book);
        book.click();
        
       System.out.println("The Art of Letting Go: Move Beyond the Hurt, Find Emotional Freedom and Restore Your Inner Peace ");
		
       
//     Assert.assertTrue(driver.getTitle().contains("Dopamine"),"Fail: the book is not currect ");
//     System.out.println("The books is currect");
//	
		
	}

}
