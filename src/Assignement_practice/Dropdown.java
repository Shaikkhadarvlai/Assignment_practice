package Assignement_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
	
    // Initialize the WebDriver
    WebDriver driver = new ChromeDriver();

    // Navigate to the URL
    driver.get("https://practice.expandtesting.com/dropdown");

    // Locate the elementsPerPageSelect dropdown element
    WebElement elementsPerPageSelect = driver.findElement(By.id("elementsPerPageSelect"));

    // Initialize the Select class with the elementsPerPageSelect dropdown element
    selectBasedDropdown(elementsPerPageSelect, "100");

    // Locate the country dropdown element
    WebElement countryDropdown = driver.findElement(By.id("country"));

    // Initialize the Select class with the country dropdown element
    selectBasedDropdown(countryDropdown, "Zimbabwe");

    // Close the browser
    driver.quit();
     }

// Method to select an option from a dropdown based on provided value
   public static void selectBasedDropdown(WebElement ele, String value) 
   {
    Select dd = new Select(ele);
    
    // Check if the dropdown supports multiple selections
    System.out.println("Does the dropdown support multiple selections? " + dd.isMultiple());
    
    // Get all options in the dropdown
    List<WebElement> allOptions = dd.getOptions();
    
    // Print the total number of options
    System.out.println("Total options are: " + allOptions.size());
    
    // Iterate through all options and print them
    for (WebElement option : allOptions) 
    {
        System.out.println(option.getText());
    }
    
    // Select the desired option
    for (WebElement option : allOptions) 
    {
        if (option.getText().contains(value)) 
        {
            option.click();
            System.out.println("Selected option: " + option.getText());
            break;
        }
    
    }

	}
}
