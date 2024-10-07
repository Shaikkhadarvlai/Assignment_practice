package Assignement_practice;

import java.util.Scanner;

public class String_Equalpoint_use 
{

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in); 

	        // Taking input from the user
	        System.out.print("Enter 'pass' or 'fail': ");
	        String result = scanner.nextLine();

	        // Using control statements to determine selection
	        if (result.equals("pass")) {
	            System.out.println("Congratulations! You are selected.");
	        } else if (result.equals("fail")) {
	            System.out.println("Sorry, you are not selected.");
	        } else {
	            System.out.println("Invalid input. Please enter 'pass' or 'fail'.");
	        }

	        scanner.close();
		
	   
		
		
	
	}

}
