package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class As86 {

	public static void main(String[] args) {
		HashMap<Integer,String> a=new HashMap<Integer,String>();
		a.put(1, "Srikanth");
		a.put(2, "Ram");
		a.put(3, "Seeta");
		a.putIfAbsent(4, "Don");
		a.putIfAbsent(3, "John");
		System.out.println(a);
		
		for(Integer i1:a.keySet())
		{
			System.out.println(i1);
		}
		for(String i2:a.values())
		{
			System.out.println(i2);
		}
		for(Entry<Integer,String> i3:a.entrySet())
		{
			System.out.println(i3);
		}
		Iterator<Entry<Integer,String>> itr = a.entrySet().iterator();

		while(itr.hasNext())
		{
		    Entry<Integer,String> e = itr.next();

		    System.out.println(e.getKey() + " --> " + e.getValue());
		}
		
		

	}

}
