package assignments;

public class As27 {
	
	static int b=200;  //Global Variable
	       int c=300;  //Instance variable

	public static void main(String[] args) {
		int a=100; //Local variable
		
		As27 z= new As27();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(z.c);
		
		a=101;
		b=201;
		z.c=301;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(z.c);
		
		

	}

}
