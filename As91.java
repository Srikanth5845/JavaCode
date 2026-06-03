package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class As91 {

	public static void main(String[] args) {
		  ArrayList<String> list1 = new ArrayList<String>();

	        list1.add("Java");
	        list1.add("SQL");
	        list1.add("API");
	        list1.add("Manual");

	        System.out.println("Original List1: " + list1);

	        // 1) fill()
	        Collections.fill(list1, "Testing");
	        System.out.println("After fill(): " + list1);

	        // --------------------------------------------

	        // 2) copy()
	        ArrayList<String> source = new ArrayList<String>();

	        source.add("Selenium");
	        source.add("Cucumber");
	        source.add("TestNG");

	        ArrayList<String> destination = new ArrayList<String>();

	        // Destination list size must be same or greater
	        destination.add("A");
	        destination.add("B");
	        destination.add("C");

	        Collections.copy(destination, source);

	        System.out.println("Source List: " + source);
	        System.out.println("Destination List after copy(): " + destination);

	        // --------------------------------------------

	        // 3) replaceAll()
	        Collections.replaceAll(destination, "TestNG", "JUnit");

	        System.out.println("After replaceAll(): " + destination);

	        // --------------------------------------------

	        // 4) rotate()
	        Collections.rotate(destination, 1);

	        System.out.println("After rotate(): " + destination);

	        // --------------------------------------------

	        // 5) disjoint()
	        ArrayList<String> list2 = new ArrayList<String>();

	        list2.add("Python");
	        list2.add("Oracle");

	        boolean result = Collections.disjoint(destination, list2);

	        System.out.println("Are lists disjoint? " + result);

	        // --------------------------------------------

	        // 6) addAll()
	        Collections.addAll(list2, "Git", "Jenkins", "Maven");

	        System.out.println("After addAll(): " + list2);
	    }
	
	

	}


