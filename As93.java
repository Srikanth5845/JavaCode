package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class As93 {

	public static void main(String[] args) {
		 List<String> list = Collections.synchronizedList(new ArrayList<>());

	        list.add("Java");
	        list.add("Selenium");
	        list.add("SQL");

	        System.out.println("Synchronized List Elements:");
	        synchronized (list) {
	            Iterator<String> listIterator = list.iterator();
	            while (listIterator.hasNext()) {
	                System.out.println(listIterator.next());
	            }
	        }

	      
	        Set<String> set = Collections.synchronizedSet(new HashSet<>());

	        set.add("Apple");
	        set.add("Mango");
	        set.add("Orange");

	        System.out.println("\nSynchronized Set Elements:");
	        synchronized (set) {
	            Iterator<String> setIterator = set.iterator();
	            while (setIterator.hasNext()) {
	                System.out.println(setIterator.next());
	            }
	        }

	       
	        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

	        map.put(101, "Ram");
	        map.put(102, "Shyam");
	        map.put(103, "Mohan");

	        System.out.println("\nSynchronized Map Elements:");
	        synchronized (map) {
	            Iterator<Map.Entry<Integer, String>> mapIterator =
	                    map.entrySet().iterator();

	            while (mapIterator.hasNext()) {
	                Map.Entry<Integer, String> entry = mapIterator.next();
	                System.out.println(entry.getKey() + " = " + entry.getValue());
	            }
	        }
	    }
	

	}


