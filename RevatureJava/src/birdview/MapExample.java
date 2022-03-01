package birdview;

import java.util.*;

public class MapExample {

	
	public static void main(String[] args)
	{
		
		
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("D","Mayur");
		
		map.put("B", "Alec");
		
		//elements can traverse in an order
		
		for(Map.Entry m:map.entrySet())
		{
			
			//System.out.println("Key is \t"+m.getKey()+"Value is \t"+m.getValue());
		}
		//retuns Set view of mappings contained in the map
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//descending order
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		
		//compare by value
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		
		
		
		
		
		
	}
	
}
