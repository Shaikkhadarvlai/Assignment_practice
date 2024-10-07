package Assignement_practice;

public class Butterfly_Structer {

	public static void main(String[] args) 
	{
		int rows = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
		
	}

}
