package Assignement_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_tack 
{
public static void main(String[] args) 
{


// Initialize the WebDriver
WebDriver driver = new ChromeDriver();

// Navigate to the SeleniumBase demo page
driver.get("https://seleniumbase.io/demo_page");

// Test the title of the page
String expectedTitle = "SeleniumBase Demo Page";
String actualTitle = driver.getTitle();
assert expectedTitle.equals(actualTitle) : "Title test failed";

// Interact with the "Click Me" button
WebElement clickMeButton = driver.findElement(By.id("myButton"));
clickMeButton.click();

// Enter text in the text box
WebElement textBox = driver.findElement(By.id("myText"));
textBox.sendKeys("Hello Selenium!");

// Retrieve and verify the message
WebElement message = driver.findElement(By.id("myMessage"));
assert message.getText().equals("This is a message!") : "Message test failed";

// Select an option from the dropdown
WebElement dropdown = driver.findElement(By.id("mySelect"));
dropdown.click();
WebElement option = driver.findElement(By.xpath("//option[@value='50%']"));
option.click();
assert option.isSelected() : "Dropdown test failed";

// Interact with checkboxes
List<WebElement> checkboxes = driver.findElements(By.name("myCheckbox"));
for (WebElement checkbox : checkboxes) {
    if (!checkbox.isSelected()) {
        checkbox.click();
    }
}

// Interact with radio buttons
List<WebElement> radioButtons = driver.findElements(By.name("myRadio"));
for (WebElement radioButton : radioButtons) {
    if (radioButton.getAttribute("value").equals("radio2")) {
        radioButton.click();
        assert radioButton.isSelected() : "Radio button test failed";
    }
}

// Interact with a link
WebElement link = driver.findElement(By.linkText("SeleniumBase"));
link.click();
assert driver.getTitle().contains("SeleniumBase") : "Link test failed";

// Navigate back to the demo page
driver.navigate().back();

// Interact with the slider
WebElement slider = driver.findElement(By.id("myRange"));
slider.sendKeys("50"); // Adjust the value as needed

// Verify the progress bar
WebElement progressBar = driver.findElement(By.id("myProgress"));
assert progressBar.getAttribute("value").equals("100") : "Progress bar test failed";

// Interact with the HTML Meter
WebElement meter = driver.findElement(By.tagName("meter"));
assert meter.getAttribute("value").equals("100") : "Meter test failed";

// Close the driver

}
}
