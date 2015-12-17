package com;

public class Fizz_3 
{
	public static void main(String[] args) 
	{
		int limit = 100, i ;
		
		for(i = 1; i<=limit;i++)
		{
			if(i % 3 == 0)
			{
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
