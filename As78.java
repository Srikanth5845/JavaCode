package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class As78 {

	public static void main(String[] args) {
	 Set<String> s=new HashSet<String>();
	 s.add("Srikanth");
	 s.add("Venkat");
     s.add("Ram");
     s.add("Seeta");
     s.add("Srikanth");
     System.out.println(s);
     System.out.println(s.size());
     System.out.println(s.contains("Ram"));
     Iterator<String> i = s.iterator();
     while(i.hasNext())
	{
		System.out.println(i.next());
	}
     Set<String> v=new HashSet<String>();
     v.addAll(s);
     System.out.println(v);
     System.out.println(v.containsAll(s));
     System.out.println(v.equals(s));
     v.remove("Srikanth");
     v.add("Suresh");
     v.removeAll(s);
     System.out.println(v);
     v.clear();
     System.out.println(v);
     System.out.println(v.isEmpty());
     
     
	
	}

}
