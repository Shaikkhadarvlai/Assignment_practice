package Assignement_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OrengHRMLogin {

	public static void main(String[] args) 
	{
		// Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Locate the username field and enter the username
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        // Locate the password field and enter the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

     // Verify the URL after login using assertion 
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"; 
        String actualUrl = driver.getCurrentUrl(); 
        Assert.assertEquals(actualUrl, expectedUrl, "Login failed or URL mismatch.");
        System.out.println("Login successful and URL verified."); 
       
      
     // Navigate to the Admin section
        WebElement adminMenu = driver.findElement(By.xpath("//span[text()='Admin']")); 
        adminMenu.click();
        
        System.out.println("Navigated to the Admin section.");
//	
//        WebElement adminElement = driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']")); 
//        System.out.println("Admin element found: " + adminElement.isDisplayed());
//        
//        
//        Assert.assertTrue(adminElement.isDisplayed(), "Admin element is not displayed."); 
//        System.out.println("Admin element is displayed correctly.");
	
        // Locate the table rows under the specified element 
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']")); 
        // Print the data from each row 
        
        for (WebElement row : rows)
        { 
        
        	System.out.println(row.getText()); 
        
        } 
        // Note: We are not closing the browser as per the request 
	
	
	}

}
