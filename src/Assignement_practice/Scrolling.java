package Assignement_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement element=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[6]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("document.querySelector(\"div[style='overflow: scroll;width: 600px;overflow-y: hidden;']\").scrollLeft=3000");    
	  
	}
	

}
