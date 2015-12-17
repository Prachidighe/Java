package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Occurence_Word 
{
	public int countWord(File file) throws FileNotFoundException 
	{
		int count = 0;
		Scanner sc = new Scanner(file);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the word to be searched:");
		String find = sc1.next();
		
		while (sc.hasNextLine()) 
		{
		    String find_word = sc.next();
		    if (find_word.equalsIgnoreCase(find))
		    	count++;
		}
		
		System.out.println(count);
		return count;
	 }
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		File file = new File("text1.txt");	
		Occurence_Word ow = new Occurence_Word();
		ow.countWord(file);
	}
}
