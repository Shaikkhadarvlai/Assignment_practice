package Assignement_practice;

import java.util.Scanner;

public class if_else_Use_To_Scanner 
{
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student marks=");
		
		int marks=sc.nextInt();
		
		if(marks >=98)
		{
			System.out.println("The student is get 100 under 98 marks is first class");
		
		}
		else if(marks>=80)
		{
			System.out.println("The student is get 80under second  class");
			
		}
		else if(marks>=70)
		{
			System.out.println("The student is get 70under Third  class");	
		}
		
		else if(marks>=35)
		{
			System.out.println("The student is get 35 abow pass marks");	
		}
		else if(marks<=35)
		{
			System.out.println("The student is get 35 under marks is faile");		
		}
	}

}
