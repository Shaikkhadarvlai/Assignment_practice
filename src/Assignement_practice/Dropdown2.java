package Assignement_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Scoursecode.Dropdownoption;

public class Dropdown2 
{
	
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://practice.expandtesting.com/dropdown");
	driver.manage().window().maximize();
	
	WebElement optin1=driver.findElement(By.xpath("//select[@id='dropdown']"));		
	
	Dropdownoption.SelectBasedDropdown(optin1,"Option2");
	
	WebElement option2=driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
	Dropdownoption.SelectBasedDropdown(option2,"100");
	
	WebElement option3=driver.findElement(By.xpath("//select[@id='country']"));
	
	Dropdownoption.SelectBasedDropdown(option3,"Zimbabwe");
	
	
	
}
}
