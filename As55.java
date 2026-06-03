package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class As55 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter string name-->");
		
		String a= s.next();
		
		char[] c = a.toCharArray();
		
		 // System.out.println(Arrays.toString(c));
         
	          
	        for(int i=0;i<c.length;i++)
	                {
	                    System.out.println(c[i]);
	                }
	               
		
		
		

	}

}
