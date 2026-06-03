package assignments;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class As94 {
	 public static void main(String[] args) {

	      
	        List<String> singletonList = Collections.singletonList("Java");

	        // Creating Singleton Set
	        Set<String> singletonSet = Collections.singleton("Selenium");

	       
	        Map<Integer, String> singletonMap =
	                Collections.singletonMap(101, "Srikanth");

	       
	        System.out.println("Singleton List : " + singletonList);
	        System.out.println("Singleton Set  : " + singletonSet);
	        System.out.println("Singleton Map  : " + singletonMap);

	        System.out.println("\nTrying to modify singleton collections...\n");

	       
	        try {
	            singletonList.add("SQL");
	        } catch (UnsupportedOperationException e) {
	            System.out.println("Cannot modify Singleton List: " + e);
	        }

	     
	        try {
	            singletonSet.add("API");
	        } catch (UnsupportedOperationException e) {
	            System.out.println("Cannot modify Singleton Set: " + e);
	        }

	      
	        try {
	            singletonMap.put(102, "Ram");
	        } catch (UnsupportedOperationException e) {
	            System.out.println("Cannot modify Singleton Map: " + e);
	        }
	    }
	}


