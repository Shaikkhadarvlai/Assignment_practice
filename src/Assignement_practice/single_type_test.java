package Assignement_practice;

import java.util.Scanner;

public class single_type_test {

	public static void main(String[] args) 
	{
		  // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take the group of letters as input
        System.out.println("Enter a group of letters: ");
        
       // Convert input to lowercase
        String input = scanner.nextLine().toLowerCase();  
        
        // Count vowels in a simplified single loop
        int vowelCount = 0;
        for (char ch : input.toCharArray())
        {
            if ("aeiou".indexOf(ch) != -1) 
            {
                vowelCount++;
            }
        }

        // Output the number of vowels
        System.out.println("Number of vowels: " + vowelCount);
        
        // Close the scanner
       scanner.close();
		
	
//        for (char c = 'A'; c <= 'Z'; c++) 
//        {
//            System.out.print(c + " ");
//        }
	
	
	}
}
