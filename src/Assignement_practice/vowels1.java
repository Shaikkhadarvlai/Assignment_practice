package Assignement_practice;

import java.util.Scanner;

public class vowels1 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the a group of latters= ");
		
	   String input=scanner.nextLine().toLowerCase();
	
	    
    int vowelCount=0;
     
    for(char ch:input.toCharArray())
    {
    	if("aeiou".indexOf(ch)!=-1)
    	{
    		vowelCount++;
    	}
    }
    System.out.println("Number of vowels="+vowelCount);
    
	   scanner.close();
	}
	
	
	
	
	
	
	
}
