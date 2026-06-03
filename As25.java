package assignments;

import java.util.Scanner;

public class As25 {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter value a");
		int a=x.nextInt();
		System.out.println("Enter value b");
		int b=x.nextInt();
		
		System.out.println(Math.sqrt(a));
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.multiplyFull(a, b));
		System.out.println(Math.subtractExact(a, b));
		System.out.println(Math.addExact(a, b));
		System.out.println(Math.abs(a));

}
}
