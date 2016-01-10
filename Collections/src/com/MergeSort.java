package com;

import java.util.Scanner;

public class MergeSort 
{
	private static void sort(int[] a, int low, int high) 
	{
		int number = high - low;
		if(number <= 1)
			return;
		
		int middle = low + number/2;
		
		sort(a, low, middle);
		sort(a, middle, high);
		
		int[] temp = new int[number];
		int i = low, j =middle;
		
		for(int k = 0; k < number; k++)
		{
			if(i == middle)
				temp[k] = a[j++];
			else if (j == high) 
				temp[k] = a[i++];
			else if (a[j] < a[i]) 
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}	
			for (int k = 0; k < number; k++) 
				a[low + k] = temp[k];
}

	public static void main(String[] args) 
	{
		int num,i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit to enter numbers:");
		num = scanner.nextInt();
		
		int arr[] = new int[num];
		System.out.println("\n Enter " +num+ " numbers:");
		
		for(i = 0; i< num; i++)
			arr[i] = scanner.nextInt();
			sort(arr,0,num);
	
		System.out.println("After Merge Sort...");
		for(i = 0; i < num; i++)
			System.out.println(arr[i]);
		
		scanner.close();
	}

}
