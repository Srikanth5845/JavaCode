package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class As92 {

	public static void main(String[] args) {
	
		List<Integer> a =new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		System.out.println(a);
		List<Integer> b =Collections.unmodifiableList(a);
		
		
		Set<Integer> c =new HashSet<Integer>();
		c.add(100);
		c.add(200);
		System.out.println(c);
		Set<Integer> d =Collections.unmodifiableSet(c);
		
		
		Map<Integer,String> e =new HashMap<Integer,String>();
		e.put(1, "sri");
		e.put(2, "kanth");
		System.out.println(e);
		Map<Integer,String> f =Collections.unmodifiableMap(e);
		
		


		  try {
	            b.add(400);
	        } catch (UnsupportedOperationException x) {
	            System.out.println("Cannot modify List: " + x);
	        }

	        
	        try {
	            d.add(500);
	        } catch (UnsupportedOperationException x) {
	            System.out.println("Cannot modify Set: " + x);
	        }

	        
	        try {
	            f.put(104, "Ravi");
	        } catch (UnsupportedOperationException x) {
	            System.out.println("Cannot modify Map: " + x);
	        }


	}

}
