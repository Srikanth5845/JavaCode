package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class As83 {

	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>();
		a.add("Srikanth");
		a.add("Venkat");
		a.add("Ram");
		a.add("Seeta");
		a.add("John");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		System.out.println(a.contains("Srikanth"));
		Collections.shuffle(a);
		System.out.println(a);
		
		
		Collection<Integer> salary =new ArrayList<Integer>();
		salary .add(100);
		salary .add(200);
		salary .add(300);
		System.out.println(Collections.min(salary));
		System.out.println(Collections.max(salary));
		
		
		
		
		
	

	}

}
