package assignments;

import java.util.Scanner;

public class As24 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter student name");
		String name =s1.next();
		System.out.println("Enter Subject1 marks");
		int a=s1.nextInt();
		System.out.println("Enter Subject2 marks");
		int b=s1.nextInt();
		System.out.println("Enter Subject3 marks");
		int c=s1.nextInt();
		System.out.println("Total marks=");
		int total=a+b+c;
		System.out.println(total);
		System.out.println("Avg marks=");
		int avg=total/3;
		System.out.println(avg);
		
		
		
		

	}

}
