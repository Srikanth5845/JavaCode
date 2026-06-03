package assignments;

public class As54 {

	public static void main(String[] args) {
		String a="Automation";
		
		boolean a1= a.matches("A(.*)"); //like operator in sql (case sensitive)
		
		System.out.println(a1);
		
		String b=a.replace('m','z');
		System.out.println(b);
		
		String c= a.replace("Auto", "Moto");
		System.out.println(c);
		
		String d= a.replaceAll("[a-z]", "");
		System.out.println(d);
		

	}

}
