package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class As90 {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<Integer>();

	        numbers.add(50);
	        numbers.add(10);
	        numbers.add(40);
	        numbers.add(20);
	        numbers.add(30);

	        System.out.println("Original List: " + numbers);

	        // 1) sort()
	        Collections.sort(numbers);
	        System.out.println("After sort(): " + numbers);

	        // 2) reverse()
	        Collections.reverse(numbers);
	        System.out.println("After reverse(): " + numbers);

	        // 3) shuffle()
	        Collections.shuffle(numbers);
	        System.out.println("After shuffle(): " + numbers);

	        // 4) max()
	        int maxValue = Collections.max(numbers);
	        System.out.println("Maximum Value: " + maxValue);

	        // 5) min()
	        int minValue = Collections.min(numbers);
	        System.out.println("Minimum Value: " + minValue);

	        // 6) swap()
	        Collections.swap(numbers, 0, 2);
	        System.out.println("After swap(0,2): " + numbers);

	        // Before binarySearch list must be sorted
	        Collections.sort(numbers);
	        System.out.println("Sorted List for binarySearch(): " + numbers);

	        // 7) binarySearch()
	        int index = Collections.binarySearch(numbers, 30);
	        System.out.println("Element 30 found at index: " + index);

	        // 8) frequency()
	        numbers.add(20);
	        numbers.add(20);

	        System.out.println("Updated List: " + numbers);

	        int freq = Collections.frequency(numbers, 20);
	        System.out.println("Frequency of 20: " + freq);
	    }
	}

	}

}
