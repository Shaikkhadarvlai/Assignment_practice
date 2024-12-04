package Assignement_practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArtOfTesting_AI_Using 
{
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
      
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the sample site
        driver.get("https://artoftesting.com/samplesiteforselenium");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Interact with the text box
        WebElement textBox = driver.findElement(By.id("fname"));
        textBox.sendKeys("Khadar Vali");

        // Interact with the button
        WebElement button = driver.findElement(By.id("idOfButton"));
        button.click();

        // Interact with the link
        WebElement link = driver.findElement(By.linkText("This is a link"));
        link.click();

        // Print the current URL to verify navigation
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Interact with the drop-down
        WebElement dropDown = driver.findElement(By.id("testingDropdown"));
        dropDown.sendKeys("Manual Testing");

        // Print the selected value to verify
        System.out.println("Selected value in drop-down: " +          dropDown.getAttribute("value"));

        // Interact with the radio button
        WebElement radioButton = driver.findElement(By.id("male"));
        radioButton.click();

        // Interact with the checkbox
        WebElement checkBox = driver.findElement(By.className("Automation"));
        checkBox.click();

        // Generate and handle the alert box
        WebElement alertButton = driver.findElement(By.xpath("//button[normalize-space()='Generate Alert Box']"));
        alertButton.click();
        
        // Switch to alert and accept it
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Generate and handle the confirm box
        WebElement confirmButton = driver.findElement(By.xpath("(//button[@style='background:#287699'])[4]"));
        confirmButton.click();
        
        // Switch to confirm box and accept it
        Alert confirm = driver.switchTo().alert();
        confirm.accept();

        // Close the browser
        driver.quit();
    }


	
}
