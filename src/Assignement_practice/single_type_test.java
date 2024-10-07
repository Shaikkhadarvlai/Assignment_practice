package Assignement_practice;

import java.util.Scanner;

public class single_type_test {

	public static void main(String[] args) 
	{
		  // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take the group of letters as input
        System.out.println("Enter a group of letters: ");
        String input = scanner.nextLine().toLowerCase();  // Convert input to lowercase
        
        // Count vowels in a simplified single loop
        int vowelCount = 0;
        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        // Output the number of vowels
        System.out.println("Number of vowels: " + vowelCount);
        
        // Close the scanner
        scanner.close();
		
	}

}
