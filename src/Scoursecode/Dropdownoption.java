package Scoursecode;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownoption 
{
	public static void SelectBasedDropdown(WebElement ele,String value)
	{
		
		Select dd=new Select (ele);
		
		System.out.println("is dropdown is select multiple selection"+dd.isMultiple());
		
		List<WebElement>alloption=dd.getOptions();
		
		System.out.println("Total option are:"+alloption.size());
		
		for(WebElement i:alloption)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
		
		
		
		
	}

}
