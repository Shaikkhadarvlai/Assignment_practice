package Assignement_practice;

import java.util.Scanner;

public class new_version_vowel_counting_using_AI 
{
	    public static void main(String[] args) 
	{
		 // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a group of letters
        System.out.println("Enter a group of letters: ");
       // Reading input from the user
        String input = scanner.nextLine();  
        // Convert the input to lowercase for easier comparison
          input = input.toLowerCase();

        // Initialize a counter for vowels
          int vowelCount = 0;

        // Loop through each character in the input string
           for (int i = 0; i < input.length(); i++)
          {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                vowelCount++;
            }
          }

        // Display the result
        System.out.println("Number of vowels in the given input: " + vowelCount);

        // Close the scanner
        scanner.close();
    

	}

}
