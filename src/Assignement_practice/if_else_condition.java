package Assignement_practice;

import java.util.Scanner;

public class if_else_condition 
{
	

	public static void main(String[] args) 
	{
		//Now write the code foe if-else statment and use Scanner 
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Marks=" );
		
		int marks=sc.nextInt();
		
		if(marks >=90)
		{
			System.out.println("The marks is firts class");
		}
		else if(marks >=70)	
		{
			System.out.println("The marks is Second class");
		}
		else if(marks >=50)
		{
			System.out.println("The marks is Third class");
		}

		else if (marks >=35)
		{
			System.out.println("The marks is pass marks");
		}	
		else if (marks <=35)
		{
			System.out.println("The marks is Fail");
		}
	}

}
