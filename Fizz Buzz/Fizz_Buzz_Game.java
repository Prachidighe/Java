package com;

import java.util.Scanner;

public class Fizz_Buzz_Game 
{
	public static void main(String[] args) 
	{
		int limit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit: ");
		
		if(sc.hasNextInt())
		{	
			limit = sc.nextInt();
			for (int i = 1; i <=limit; i++) 
			{
				if (i % 3 == 0) 
				{
					System.out.println("Fizz");
				} 
				else if (i % 5 == 0) 
				{
					System.out.println("Buzz");
				} 
				else if ((i % 3 == 0) && (i % 5 == 0)) 
				{
					System.out.println("Fizz Buzz");
				}
				else 
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("Please enter only integers.");
		}
	}		
}

