package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class As76 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Srikanth");
		a.add("venkat");
		a.add("Ram");
		
		Iterator<String> a1= a.iterator();
		
		while(a1.hasNext())
		{
			System.out.println(a1.next());
		}
		
      ListIterator<String> b1= a.listIterator();
		
		while(b1.hasNext())
		{
			System.out.println(b1.next());
		}
		while(b1.hasPrevious())
		{
			System.out.println(b1.previous());
		}
		
		a.add("Seeta");
		System.out.println(a);
		a.set(1, "Raju");
		System.out.println(a);
		a.remove("Srikanth");
		System.out.println(a);
	
	

	}

}
