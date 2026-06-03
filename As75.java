package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class As75 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(22);
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(0, 99);
		System.out.println(b);
		ArrayList<String> c=new ArrayList<String>();
	    c.add("srikanth");
		System.out.println(c);
		ArrayList<String> d=new ArrayList<String>();
	    d.addAll(c);
		System.out.println(d);
		System.out.println(d.contains("srikanth"));
		
		Collection<String> c1 = new ArrayList<String>();
        c1.add("Java");
        c1.add("SQL");
        c1.add("API");

        Collection<String> c2 = new ArrayList<String>();
        c2.add("Java");
        c2.add("SQL");

        boolean result = c1.containsAll(c2);
        System.out.println(result);
        c1.remove("API");
        System.out.println(c1);
        c1.removeAll(c1);
        System.out.println(c1);
        System.out.println(c2);
        c2.clear();
        System.out.println(c2);
       boolean z= c2.isEmpty();
       System.out.println(z);
      
       ArrayList<String> a1 = new ArrayList<String>();

       a1.add("Java");
       a1.add("SQL");
       a1.add("API");

       String value = a1.get(1);

       System.out.println(value);
       
      
       
		
		

	}

}
