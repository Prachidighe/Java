package com;

public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		int limit = 100, i;
		
		for(i = 1; i<=limit;i++)
		{
			if((i%3==0) && (i%5==0))
			{
				System.out.println("FizzBuzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
