package Assignement_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_application_testing_useing_AI
{

	public static void main(String[] args) 
	{
		   // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Amazon India website
        driver.get("https://www.amazon.in");
        //globle waise explicity waite use
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
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


        // Select the specified element from the search results 
        WebElement specifiedElement = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
        specifiedElement.click();
        
        // Close the driver
       // driver.quit();
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
