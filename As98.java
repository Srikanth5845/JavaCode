package assignments;

import java.util.Iterator;
import java.util.PriorityQueue;

public class As98 {
	 public static void main(String[] args) {

	        PriorityQueue<String> pq = new PriorityQueue<>();

	        // add()
	        pq.add("Java");
	        pq.add("Selenium");

	        // offer()
	        pq.offer("SQL");
	        pq.offer("API");

	        System.out.println("PriorityQueue: " + pq);

	        // peek()
	        System.out.println("\npeek(): " + pq.peek());

	        // element()
	        System.out.println("element(): " + pq.element());

	        // iterator()
	        System.out.println("\nElements using iterator():");
	        Iterator<String> it = pq.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        // contains()
	        System.out.println("\ncontains(\"SQL\"): "
	                + pq.contains("SQL"));

	        // size()
	        System.out.println("size(): " + pq.size());

	        // poll()
	        System.out.println("\npoll(): " + pq.poll());
	        System.out.println("After poll(): " + pq);

	        // remove()
	        System.out.println("\nremove(): " + pq.remove());
	        System.out.println("After remove(): " + pq);

	        // clear()
	        pq.clear();
	        System.out.println("\nAfter clear(): " + pq);

	        // isEmpty()
	        System.out.println("isEmpty(): " + pq.isEmpty());
	    }
	}


