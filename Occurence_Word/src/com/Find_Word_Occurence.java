//Using Methods and hardCoding the values

package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Find_Word_Occurence 
{
	int word_count(String word,File file) throws IOException
	{
		String line;
		int count = 0;
	
			InputStream is = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while((line = br.readLine()) != null)
			{
				String[] tokens = line.split(" ");
				
				for (int i = 0; i < tokens.length; i++) 
				{
					if(word.equalsIgnoreCase(tokens[i]))
					{
						count++;
					}
				}
			}
			br.close();
		System.out.println("Occurence of a word is:" +count);
		return count;
	}
	
	public static void main(String[] args) throws IOException 
	{
		File file = new File("text1.txt");
		Find_Word_Occurence fwo = new Find_Word_Occurence();
		fwo.word_count("Southern",file);
	}
}