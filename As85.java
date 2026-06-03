package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class As85 {

	public static void main(String[] args) {
		Map<Integer,String> a=new HashMap<Integer,String>();
		a.put(1, "Srikanth");
		a.put(2, "Ram");
		a.put(3, "Seeta");
		a.putIfAbsent(4, "Don");
		a.putIfAbsent(3, "John");
		System.out.println(a);
		
		Map<Integer,String> b=new HashMap<Integer,String>();
		b.putAll(a);
		System.out.println(b);
		b.remove(1);
		System.out.println(b);
		System.out.println(b.containsKey(1));
		System.out.println(b.containsValue("Don"));
		System.out.println(b.get(2));
		System.out.println(b.size());
		b.clear();
		System.out.println(b);
		System.out.println(b.isEmpty());
		
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

	}

}
