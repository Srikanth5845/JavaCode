package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class As77 {

	public static void main(String[] args) {
		 List<Integer> a=new ArrayList<Integer>();
		 a.add(1);
		 a.add(2);
		 a.add(3);
		 a.add(4);
		 a.add(5);
		 a.add(0, 100);
		 System.out.println(a);
		 a.remove(0);
		 System.out.println(a);
		 boolean s=a.contains(1);
		 System.out.println(s);
		 
		Iterator<Integer> i = a.iterator();
	      while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
      ListIterator<Integer> i1= a.listIterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
		System.out.println(a.get(4));
		

	}

}
