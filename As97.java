package assignments;

import java.util.LinkedList;

public class As97 {
	public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Java");
        list.add("Selenium");
        list.add("SQL");

        System.out.println("After add(): " + list);

        // get()
        System.out.println("Element at index 1 using get(): "
                + list.get(1));

        // addFirst()
        list.addFirst("API");
        System.out.println("After addFirst(): " + list);

        // addLast()
        list.addLast("TestNG");
        System.out.println("After addLast(): " + list);

        // getFirst()
        System.out.println("First Element: "
                + list.getFirst());

        // getLast()
        System.out.println("Last Element: "
                + list.getLast());

        // offer()
        list.offer("Git");
        System.out.println("After offer(): " + list);

        // peek()
        System.out.println("Element returned by peek(): "
                + list.peek());

        // poll()
        System.out.println("Element removed by poll(): "
                + list.poll());
        System.out.println("After poll(): " + list);

        // removeFirst()
        System.out.println("Removed First Element: "
                + list.removeFirst());
        System.out.println("After removeFirst(): " + list);

        // removeLast()
        System.out.println("Removed Last Element: "
                + list.removeLast());
        System.out.println("After removeLast(): " + list);
    }
}


