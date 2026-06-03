package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class As80 {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("Srikanth");
		a.add("Ram");
		a.add("Srikanth");
		System.out.println(a);
		
		Set<String> s=new HashSet<String>(a);
		System.out.println(s);
		s.add("Venkat");
		System.out.println(s);

	}

}
