package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_Sorting
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Red");
		hm.put(102, "Orange");
		hm.put(103, "Apple");
		hm.put(104, "Yellow");
		
		System.out.println("----------Before Sorting...");
		
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) 
		{
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey()+ " " +me.getValue());
		}
		
		System.out.println("\n ------ After Sorting...");
		Map<Integer, String> hm1 = sort(hm);
		Set set1 = hm1.entrySet();
		Iterator it1 = set1.iterator();
		while (it1.hasNext()) {
			Map.Entry me1 = (Map.Entry) it1.next();
			System.out.println(me1.getKey()+ " " +me1.getValue());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static HashMap sort(HashMap hm1) 
	{
		List list = new LinkedList(hm1.entrySet());
		Collections.sort(list, new Comparator() 
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				return ((Comparable) ((Map.Entry) (o1)).getValue())
		                  .compareTo(((Map.Entry) (o2)).getValue());
			}
			
		});
		HashMap sortedList = new LinkedHashMap();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) 
		{
			Map.Entry entry = (Map.Entry) iterator.next();
			sortedList.put(entry.getKey(), entry.getValue() );
		}
		return sortedList;
	}
}	