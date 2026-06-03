package assignments;

import java.util.HashMap;
import java.util.Map;

public class As84 {

	public static void main(String[] args) {
		Map<Integer,String> a=new HashMap<Integer,String>();
		a.put(100, "Srikanth");
		a.put(200, "Venkat");
		System.out.println(a);
		Map<String,Double> b=new HashMap<String,Double>();
		b.put("Srikanth", 10.22);
		b.put ("Venkat",11.22);
		System.out.println(b);
		Map<Integer,Character> c=new HashMap<Integer,Character>();
		c.put(100, 'A');
		c.put(200, 'B');
		System.out.println(c);
		Map<String,Boolean> d=new HashMap<String,Boolean>();
		d.put("Srikanth", true);
		d.put ("Venkat",false);
		System.out.println(d);



	}

}
