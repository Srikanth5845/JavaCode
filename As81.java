package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class As81 {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("Srikanth");
		s.add("Ram");
		s.add("Srikanth");
		System.out.println(s);
		
		List<String> a=new ArrayList<String>(s);
		System.out.println(a);
		a.add("Srikanth");
		System.out.println(a);


	}

}
