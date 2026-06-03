package assignments;

import java.util.Scanner;

public class As50 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
	System.out.println("Enter a string-->");
	
	String b = a.next();
	System.out.println(b.length());
	System.out.println(b.concat("kumar"));
	System.out.println(b.equals("Srikanth"));
	System.out.println(b.contains("Sri"));
	System.out.println(b.equalsIgnoreCase("SriKanth"));
	System.out.println(b.substring(0));
	System.out.println(b.substring(0,3));
	System.out.println(b.trim());
	System.out.println(b.charAt(2));
	System.out.println(b.indexOf("i"));
	
	
	}

}
