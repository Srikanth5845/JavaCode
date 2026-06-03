package assignments;

import java.util.Enumeration;
import java.util.Vector;

public class As79 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Srikanth");
		v.addElement("Venkat");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.contains("Srikanth"));
		
		Enumeration<String> a=v.elements();
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.set(0, "Ram");
		System.out.println(v);
		

	}

}
