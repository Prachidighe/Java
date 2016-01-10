package com;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Apple");
		pq.add("Orange");
		pq.add("Pineapple");
		pq.add("Kiwi");
		
		System.out.println("Top : " +pq.element());
		
		Iterator i = pq.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		System.out.println("Removing...");
		pq.remove();
		pq.poll(); //removes the element which is at the top
		pq.poll();
		
		System.out.println("Elements in queue:");
		Iterator<String> i1 = pq.iterator();
		while (i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
	}
}
