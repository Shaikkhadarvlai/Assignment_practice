package Assignement_practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_AI 
{

	public static void main(String[] args) 
	{
		// Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Amazon India website
        driver.get("https://www.amazon.in");

        // Locate the search dropdown element
        WebElement searchDropdown = driver.findElement(By.id("searchDropdownBox"));

        // Use the provided method to select "Watches" from the dropdown
        selectBasedDropdown(searchDropdown, "Watches");

        // Locate the search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        // Enter "men's watches" into the search box
        searchBox.sendKeys("men's watches");

        // Locate the search button and click it
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        // Wait for the search results to load (you might want to use WebDriverWait here for a more robust solution)
        try {
            Thread.sleep(3000); // Wait for 3 seconds (adjust as necessary)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Select the specified element from the search results
        WebElement specifiedElement = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
        specifiedElement.click();

        // Switch to the new window
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> a = windows.iterator();
        String Parentswindow = a.next();
        String Childwindow = a.next();
        driver.switchTo().window(Childwindow);

        // Wait for the product page to load
        try {
            Thread.sleep(3000); // Wait for 3 seconds (adjust as necessary)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate the "Add to Cart" button and click it
        WebElement addToCartButton = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCartButton.click();

              
        // Close the driver
        driver.quit();
    }

    // Provided method to select an option from a dropdown based on provided value
    public static void selectBasedDropdown(WebElement ele, String value) {
        Select dd = new Select(ele);
        
        // Check if the dropdown supports multiple selections
        System.out.println("Does the dropdown support multiple selections? " + dd.isMultiple());
        
        // Get all options in the dropdown
        List<WebElement> allOptions = dd.getOptions();
        
        // Print the total number of options
        System.out.println("Total options are: " + allOptions.size());
        
        // Iterate through all options and print them
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        
        // Select the desired option
        for (WebElement option : allOptions) {
            if (option.getText().contains(value)) {
                option.click();
                System.out.println("Selected option: " + option.getText());
                break;
            }
        }

    }
}
