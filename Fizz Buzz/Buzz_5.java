package com;

public class Buzz_5 
{
	public static void main(String[] args) 
	{
		int limit = 100,i;
		
		for (i = 1; i <= limit; i++) 
		{
			if(i%5 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
