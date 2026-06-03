package assignments;

public class As19 {
	
	public static void calculate(int a,int b)
	{
		int c=a+b;
		
		System.out.println("Addition of two numbers="+c);
	}
	public static void calculate(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition of three numbers="+d);
	}
	public void calculate(double a, double b)
	{
		double c=a*b;
		System.out.println("Multiplication of two numbers="+c);
	}
	public void calculate(int a, double b)
	{
		double c=a-b;
		System.out.println("subtraction of two numbers="+c);
	}
	public static void main(String[] args) {
		calculate(10,20);
		calculate(10,20,30);
		As19 x= new As19();
		x.calculate(5.0, 5.0);
		x.calculate(10,2.50);
		
	}

}
