package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class As82 {

	public static void main(String[] args) {
		Collection<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		
		Iterator<Integer> s=a.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
		Collection<Integer> b=new ArrayList<Integer>();
		b.addAll(a);
		System.out.println(b);
		b.remove(40);
		System.out.println(b);
		System.out.println(b.contains(10));
		System.out.println(b.containsAll(a));
		System.out.println(b.size());
		b.add(100);
		b.removeAll(a);
		System.out.println(b);
		b.clear();
		System.out.println(b);
		System.out.println(b.isEmpty());
		System.out.println(b.equals(a));
		
		
		

	}

}
